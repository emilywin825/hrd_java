 package object;
/*
 * 클래스명 Employee
 * -name:String
 * -dept:String
 * -pay:int
 * -score:double
 * 
 *  +setName(name:String):void
 *  +setDept(dept:String):void
 *  +setPay(pay:int):void
 *  +setScore(score:double):void
 *  +getName():String
 *  +getDept():String
 *  +getpay():int
 *  +getscore():double
 * */
public class Employee {
	private String name;
	private String dept;
	private int pay;
	private double score;
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void setEmployee(String name,String dept,int pay,double score) {
		this.name=name;
		this.dept=dept;
		this.pay=pay;
		this.score=score;
	}
	public String toString() {
		return "이름은 "+name+"이고 "+dept+"에 근무하며 급여는 "+pay+"원 입사성적은 "+score+"점입니다.";
	}
}
