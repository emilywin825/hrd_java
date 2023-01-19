package object;

/*
 * 클래스명 : Emp2
 * -name:String
 * -dept:String
 * -salary:int
 * +Emp2(name:String,dept:String,salary:int)
 * +toString():String
 * 윈터사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
 */
class Emp2{
		private String name;
		private String dept;
		private int salary;
		public Emp2(String name, String dept,int salary) {
			this.name=name;
			this.dept=dept;
			this.salary=salary;
		}
		public String toString() {
			return name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다.";
		}
	}
public class ObjectTest2 {
	
	public static void main(String[] args) {
		Emp2 em=new Emp2("윈터", "개발부", 1520000);
		System.out.println(em.toString());
	}

}

//------------------------------------------------------------------
/*
 * 클래스명 : Emp2
 * -name:String
 * -dept:String
 * -salary:int
 * +SetEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 * 윈터사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
 */
//class Emp2{
//		private String name;
//		private String dept;
//		private int salary;
//		public void SetEmp(String name, String dept,int salary) {
//			this.name=name;
//			this.dept=dept;
//			this.salary=salary;
//		}
//		public void printEmp() {
//			System.out.println(name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다.");
//		}
//	}
//public class ObjectTest2 {
//	
//	public static void main(String[] args) {
//		Emp2 em=new Emp2();
//		em.SetEmp("윈터", "개발부", 1520000);
//		em.printEmp();
//	}
//
//}
