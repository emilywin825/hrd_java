package seven;

class Salary{
	private String name;
	private int salary;
	public Salary() {
		
	}
	public Salary(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public void viewInformation() {
		System.out.println("이름 : "+this.name);
		System.out.println("연봉 : "+this.salary);
	}
}
class Test41 extends Salary{
	private String department;
	public Test41() {
		// TODO Auto-generated constructor stub
	}
	public Test41(String name,int salary,String department) {
		super(name,salary);
		this.department=department;
	}
	public void viewInformation() {
		super.viewInformation();
		System.out.println("개발부 : "+department);
	}
}

public class hw41 {

	public static void main(String[] args) {
		Test41  ob = new Test41("홍길동",85000000,"개발부");
		ob.viewInformation();
	}

}
