package eight;

import java.text.DecimalFormat;

class Emp {
	String name = "홍길동";
	int salary = 32000000;

	public String getDisplay() {
		DecimalFormat df=new DecimalFormat("###,###");
		return "이름 : " + name + "\n연봉 : " + df.format(salary) + "원";
	}
}

class EmpExt extends Emp {
	String department = "홍보부";

	public String getDisplay() {
		return super.getDisplay() + "\n부서 : " + department;
	}
} 

public class hw44 {

	public static void main(String[] args) {
		EmpExt ob = new EmpExt();
		System.out.println(ob.getDisplay()); 
	}

}
