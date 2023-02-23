CREATE TABLE bookmember(
USERID VARCHAR2(8) PRIMARY KEY,
USERPWD VARCHAR2(10) NOT NULL
);

insert into bookmember values ('candy','1234');
insert into bookmember values ('admin','5678');

select * from BOOKSHOP2;
//-------------------------------------------------------
CREATE TABLE BOOKSHOP2(
ISBN VARCHAR2(15) PRIMARY KEY,
TITLE VARCHAR2(50) NOT NULL,
AUTHOR VARCHAR2(10) NOT NULL,
COMPANY VARCHAR2(50),
PRICE NUMBER
)

insert into BOOKSHOP2 values ('88-90-11', '오라클 3 일완성', '이오라', '야메루출판사', 15000);
insert into BOOKSHOP2 values ('90-10-12', 'JSP 달인되기', '송 JP', '공갈닷컴', 20000);
insert into BOOKSHOP2 values ('87-90-33', '자바무따기', '김자바', '디지탈박스', 35000);




