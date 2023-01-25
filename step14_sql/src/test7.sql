[ VIEW ]
  : 다른 테이블이나 뷰에 포함된 맞춤표현(virtual table)
    join하는 테이블의 수가 늘어나거나 질의문이 길고 복잡해지면 작성이 어려워지고 유지보수가 
    어려울수 있다. 
    이럴때 스크립트를 만들어두거나 stored query를 사용해서
    데이터베이스 서버에 저장해두면 필요할때 마다 호출해서 사용할수 있다

   - 자체적으로 데이터를 포함하지 않는다
   - 베이스테이블(Base table) : 뷰를 통해 보여지는 실제테이블
   - 선택적인 정보만 제공 가능

[형식]
create [or  replace] [force | noforce ] view  뷰이름 [(alias [,alias,.....)]
as 서브쿼리
[with check option [constraint 제약조건이름]]
[with read only [constraint 제약조건이름]]

  - create or replace : 지정한 이름의 뷰가 없으면 새로생성,동일이름이 있으면 수정 (생략 가능하지만 보통 작성함)
  - force | noforce
          force   : 베이스테이블이 존재하는 경우에만 뷰생성가능
          noforce : 베이스테이블이 존재하지 않아도 뷰생성가능
  - alias  
        뷰에서 생성할 표현식 이름(테이블의 컬럼이름 의미)
        생략하면 서브쿼리의 이름적용
        alias의 갯수는 서브쿼리의 갯수와 동일해야함
  - 서브쿼리 : 뷰에서 표현하는 데이터를 생성하는 select구문
  - 제약조건 
        with check option : 뷰를 통해 접근가능한 데이터에 대해서만 DML작업가능
        with read only : 뷰를 통해 DML작업안됨
        제약조건으로 간주되므로 별도의 이름지정가능


[뷰 - 인라인(inline)개념]  
  : 별칭을 사용하는 서브쿼리 (일반적으로 from절에서 사용)

[뷰 - Top N분석]
  Top N분석 : 조건에 맞는 최상위(최하위) 레코드를 N개 식별해야 하는 경우에 사용
   예) 최상위 소득자3명
        최근 6개월동안 가장 많이 팔린 제품3가지
       실적이 가장 좋은 영업사원 5명
   
   오라클에서 Top N분석원리
      - 원하는 순서대로 정렬
      - rownum 이라는 가상의컬럼을 이용하여 순서대로 순번부여
      - 부여된 순번을 이용하여 필요한수 만큼 식별
      - rownum값으로 특정행을 선택할수 없음
        (단, Result Set  1st  행(rownum=1)은 선택가능)
===============================================================================
--ex1) 사원테이블에서 부서가 90인 사원들을 v_view1으로 뷰테이블을 만드시오
     (사원ID,사원이름,급여,부서ID만 추가)
create or replace view v_view1
as
select employee_id, last_name, salary, department_id
from employees
where department_id=90;

select * from v_view1;
select * from tab;

--ex2) 사원테이블에서 급여가  5000이상 10000이하인 사원들만 v_view2으로 뷰를 만드시오
--    (사원ID , 사원이름, 급여, 부서ID)

create or replace view v_view2
as 
select employee_id, last_name, salary, department_id
from employees
where salary>=5000 and salary<=10000;

select * from v_view1;

--ex3) v_view2 테이블에서  103사원의 급여를 9000.00에서 12000.00으로 수정하시오

update v_view2 set salary=12000 where employee_id=103; -- 값이 수정되면 v_view2의 범위를 벗어남

rollback;
update employees set salary=9000 where employee_id=103;


--ex4)사원테이블과 부서테이블에서 사원번호,사원명,부서명을 v_view3로 뷰테이블을만드시오
--     조건1) 부서가 10,90인 사원만 표시하시오
--     조건2) 타이틀은  사원번호, 이름, 부서이름으로 출력하시오
--     조건3) 사원번호로 오름차순정렬하시오

create or replace view v_view3 
as 
	select employee_id, last_name, department_name
	from employees e, departments d
	where e.department_id=d.department_id and d.department_id IN(10,90)
	order by 1;

create or replace view v_view3 
as 
	select employee_id, last_name, department_name
	from employees 
	join departments using(department_id)
	where department_id IN(10,90)
	order by 1;

select * from v_view3;
--ex5) 부서ID가 10,90번 부서인 사원들의 부서 위치를 표시하시오
--     조건1) v_view4로 뷰테이블을 만드시오
--     조건2) 타이틀을  사원번호,사원명,급여,입사일,부서명,부서위치(city)로 표시하시오
--     조건3) 사원번호순으로 오름차순정렬하시오
--     조건4) 급여는 천단위절사하고,세자리마다 콤마와 '달러'을 표시하시오
--     조건5) 입사일은  '2004년 10월 02일' 형식으로 표시하시오  
create or replace view v_view4(사원번호, 사원명, 급여, 입사일, 부서명, 부서위치)
as
select employee_id,last_name,to_char(trunc(salary,-3),'999,999')||'달러',to_char(hire_date,'YYYY"년" MM"월" DD"일"'),department_name,city
from employees
join departments using (department_id)
join locations using(location_id)
where department_id in(10,90)
order by 1;

select * from v_view4;

drop view v_view4; -- view삭제

--ex6) 뷰에 제약조건달기
--사원테이블에서 업무ID가 'IT_PROG'인 사원들의  사원번호,이름,업무ID만 v_view5 뷰테이블을 작성하시오, 
--단 수정불가의 제약조건을 추가하시오
create or replace view v_view5
as
	select employee_id, last_name,job_id
	from employees
	where job_id='IT_PROG'
with read only; --수정불가의 제약조건

select * from v_view5;

delete from v_view5 where employee_id=103;

--ex7) 뷰에 제약조건달기
--사원테이블에서 업무ID가 'IT_PROG'인 사원들의 사원번호,이름,이메일,입사일,업무ID만 
--v_view6 뷰테이블을 작성하시오 
--단 업무ID가 'IT_PROG'인 사원들만 추가,수정할수 있는 제약조건을 추가하시오

create or replace view v_view6
as 
	select employee_id, last_name, email, hire_date, job_id
	from employees
	where job_id='IT_PROG'
with check option;

select * from v_view6

insert into v_view6(employee_id, last_name, email, hire_date, job_id)
values (500,'kim', 'abcd', '2023-01-25', 'SA_REP');
-- 에러: SA_REP 추가가 안되는 with check option 제약조건 위배
update v_view6 set job_id='SA_REP' where employee_id=103
-- 에러: SA_REP 수정이 안되는 with check option 제약조건 위배

insert into v_view6(employee_id, last_name, email, hire_date, job_id)
values (500,'kim', 'abcd', '2023-01-25', 'IT_PROG');
select * from employees

--rollback
delete 
--==========================================================================================================================
--[문제]  계정  edu로 바꾸시오
--테이블명 : bookshop
--isbn         varchar2(10)       기본키 (제약조건명:PISBN)            ISBN
--title         varchar2(50)        널값허용X (제약조건명:CTIT)         책제목
--author     varchar2(50)                                           저자 
--price        number                                               금액
--company    varchar2(30)                                           출판사

--is001     자바3일완성        김자바     25000   야메루출판사
--pa002     JSP달인되기        이달인     28000   공갈닷컴
--or003     오라클무작정따라하기  박따라     23500   야메루출판사

create table bookshop(
isbn 		varchar2(10) constraint PISBN primary key, 
title 		varchar2(50) constraint CTIT not null, 
author 		varchar2(50),
price 		number,
company 	varchar2(30) 
);

insert into bookshop values('is001', '자바3일완성', '김자바', 25000, '야메루출판사');
insert into bookshop values('pa002', 'JSP달인되기', '이달인', 28000, '공갈닷컴');
insert into bookshop values('or003', '오라클무작정따라하기', '박따라', 23500, '야메루출판사');
--commit
select * from bookshop;
-------------------------------------------------------------------------------
--테이블명 : bookorder

--idx        number            primary key    일련번호 (주문번호)        
--isbn       varchar2(10)      외래키(제약조건명 : FKISBN)      bookshop의 isbn의 자식키
--qty        number            수량
create table bookorder(
idx 	number 		   primary key,
isbn	varchar2(10),	
constraint FKISBN foreign key(isbn) references bookshop(isbn),
qty 	number 
)

create table bookorder(
idx 	number 		   primary key,
isbn	varchar2(10)   constraint FKISBN references bookshop,	
qty 	number 
)
---------------------------------------------------------------------------------
--시퀀스명 : idx_seq   증가값: 1  시작값 1
create sequence  idx_seqs start with 1
increment by 1 nocycle nocache;
--1          is001     2
--2          or003     3
--3          pa002     5
--4          is001     3
--5          or003    10

insert into bookorder values(idx_seqs.nextval, 'is001',2); --시퀀스 사용 
insert into bookorder values(idx_seqs.nextval, 'or003',3);
insert into bookorder values(idx_seqs.nextval, 'pa002',5);
insert into bookorder values(idx_seqs.nextval, 'is001',3);
insert into bookorder values(idx_seqs.nextval, 'or003',10);

select * from bookorder;

--뷰 명 : bs_view

--책제목        저자      총판매금액 
-----------------------------------------                           
--조건1)  총판매금액은  qty * price로 하시오       
--조건2) 수정불가의 제약조건을 추가하시오


create or replace view bs_view (책제목,저자,총판매금액)
as 
	select title, author, qty*price
	from bookshop
	join bookorder using(isbn)
with read only;

select * from bs_view;
--=====================================================================================================
--HR계정으로 변경
--ex8) 
--사원테이블을 가지고 부서별 평균급여를 뷰(v_view7)로 작성하시오
--조건1) 반올림해서 1000단위까지 구하시오
--조건2) 타이틀은  부서ID,부서평균
--조건3) 부서별로 오름차순정렬하시오
--조건4) 부서ID가 없는 경우 5000으로 표시하시오
create or replace view v_view7("부서ID",부서평균)
as
	select nvl(department_id,5000), round(avg(salary),-3) 
	from employees
	group by department_id
	order by 1; 
	
select * from v_view7;	

--ex9)인라인 뷰 - from 절에 테이블 이름이 아닌 서브 쿼리가 등장
-- 인라인 : 코드안에 코드가 들어가 있는 것
--부서별 최대급여를 받는 사원의 부서명,최대급여를 출력하시오
select department_name, max(salary)
from (select department_id, department_name from departments)
join employees using(department_id)
group by department_name;


--쿼리 목표: 사원테이블과 부서테이블에서 '부서별' 월급 총합, 평균, 부서별 인원수를 출력하세요
select department_id,sum(salary),avg(salary),count(*)
from employees
join departments using(department_id)
group by department_id

select sum(salary),avg(salary),count(*)
from(select department_id,sum(salary),avg(salary),count(*) from employees
	 group by  department_id)e, deaprtments d
where e.department_id=d.department_id;		

--ex10) Top N분석
--급여를 가장많이 받는 사원3명의 이름,급여를 표시하시오
select rownum,last_name,salary
from (select last_name, salary
		from employees
		order by 2 desc)
where rownum<=3;

select rownum,last_name, salary
from employees
order by salary;




--ex11) 최고급여를 받는 사원1명을 구하시오 --강사님 질문 밑의 두개 결과 다름
select rownum,last_name,salary
from (select last_name, salary
	  from employees
	  order by 2 desc) where rownum=1;

select rownum, last_name, salary
from employees
where rownum=1;

--rownum<=1(o), rownum=2(x), rownum<=2(o)
--rownum은 쿼리 결과를 하나씩 출력하면서 번호(rownum)를 부여
--rownum은 시작부터 번호를 부여해야 확인 가능, 중간부터 번호를 지정하면 결과가 나오지 않음


--ex12) 급여의 순위를 내림차순정렬했을때, 3개씩 묶어서 2번째 그룹을 출력하시오
--      (4,5,6 순위의 사원출력  ==> 페이징처리기법　＝＞　１페이지，２페이지　이렇게　표시되는거　구현할　때　사용) 
select employee_id,last_name,salary,page
from (select tt.*,ceil(rownum/3) as page
		from (select * 
		         from employees 
		         order by salary desc)tt)
where page=2;
--ceil(rownum/3) as page :페이징처리 기법
  
--ex13) 사원들의 연봉을 구한후 최하위 연봉자 5명을 추출하시오
--      조건1) 연봉 = 급여*12+(급여*12*커미션)
--      조건2) 타이틀은  사원이름 , 부서명, 연봉
--      조건3) 연봉은  $25,000  형식으로 하시오

-- 사원이름     부서명     연봉
-- -------------------------------
--Olson	        Shipping     $25,200
--Markle        Shipping     $26,400
--Philtanker    Shipping     $26,400
--Gee           Shipping     $28,800
--Landry        Shipping     $28,800

select last_name 사원이름,department_name 부서명, '$'||totalsal 연봉
from ( select last_name, department_id, salary*12+( salary*12*nvl( commission_pct,0 ) ) totalsal
		 from employees
		 order by 3 asc )
		 left join departments using(department_id)
where rownum<=5;

select * from employees

