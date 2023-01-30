package emp_01_11;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		System.out.println("***** 모든 사원 출력하기 *****");
		
		List<EmpVo> list = dao.getEmpList();
		
		for(EmpVo ob:list){//list에서 data 꺼냄 그 데이터의 자료형은 EmpVo
			System.out.print("이름 : "+ob.getEname());
			System.out.print("\t부서 : "+ob.getDept());
			System.out.println("\t급여 : "+ob.getSalary());
		}
		//-----------------------------------------------------------
		System.out.println("***** 크롱 사원 출력하기 *****");
		
		EmpVo em=dao.getEmp("뽀로로");
		
		if(em==null) {
			System.out.println("찾는 사람이 없습니다.");
		}else {
			System.out.print("이름 : "+em.getEname());
			System.out.print("\t부서 : "+em.getDept());
			System.out.println("\t급여 : "+em.getSalary());}
		
	}
}
