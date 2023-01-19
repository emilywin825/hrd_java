package object;

/*
 * 클래스명 : Emp1
 * -name:String
 * -dept:String
 * -salary:int
 * +Emp1(name:String,dept:String,salary:int)
 * +printEmp():void
 */
class Emp1{
	private String name;
	private String dept;
	private int salary;
	public Emp1(String name,String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void printEmp() {
		System.out.println(name);
		System.out.println(dept);
		System.out.println(salary);
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		Emp1 em=new Emp1("뽀로로", "개발부", 150);
		em.printEmp();
	}
}

//-----------------------------------------------------
/*
 * 클래스명 : Emp1
 * -name:String
 * -dept:String
 * -salary:int
 * +SetEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 */
//class Emp1{
//	private String name;
//	private String dept;
//	private int salary;
//	public void SetEmp(String name,String dept, int salary) {
//		this.name=name;
//		this.dept=dept;
//		this.salary=salary;
//	}
//	public void printEmp() {
//		System.out.println(name);
//		System.out.println(dept);
//		System.out.println(salary);
//	}
//}
//
//public class ObjectTest1 {
//
//	public static void main(String[] args) {
//		Emp1 em=new Emp1();
//		em.SetEmp("뽀로로", "개발부", 150);
//		em.printEmp();
//
//	}
//}
