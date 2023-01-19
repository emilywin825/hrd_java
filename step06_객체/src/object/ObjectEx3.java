 package object;
//setter&getter : 멤버변수 하나당 하나씩 값을 대입하는 setter
//                그 값을 리터하는 getter
class Member{ //동일한 패키지 내에서 같은 이름의 클래스 있으면 오류
	private String name;
	private int age;
	private double tall;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void settall(double tall) {
		this.tall=tall;
	}
	public double gettall() {
		return tall;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member ob=new Member();
		ob.setName("이순신");
		ob.setAge(23);
		ob.settall(175.3);
		System.out.println(ob.getName());
		System.out.println(ob.getAge());
		System.out.println(ob.gettall());
	}

}
