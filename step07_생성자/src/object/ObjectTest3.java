package object;

/*클래스명 : Emp3
-name:String
-dept:String
-salary:int
+getter & setter
+toString():String

윈터사원은 개발부에서 근무하며 1520000원의 급여를 받습니다
이름 : 윈터
부서 : 개발부
급여 : 1520000원
*/
class Emp3{
	private String name;
	private String dept;
	private int salary;
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다.";
	}
}
public class ObjectTest3 {

	public static void main(String[] args) {
		Emp3 em=new Emp3();
		em.setName("윈터"); em.setDept("개발부"); em.setSalary(1520000);
		System.out.println(em.toString());
		System.out.println("이름 : "+em.getName());
		System.out.println("부서 : "+em.getDept());
		System.out.println("급여 : "+em.getSalary());
	}

}
