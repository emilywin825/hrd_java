package methodex;

public class MethodEx8 {
	public static void view1() {//생명주기:프로그램 종료시
		System.out.println("static mehtod");
	}
	
	public void view2() {//생명주기:사용하는 동안만
		System.out.println("non static method");
	}
	
	public static void main(String[] args) {//생명주기:프로그램 종료시
		//클래스 메서드(static method): 객체 없이 호출 가능, 함수 이름만으로 호출
		view1();
		MethodEx8.view1(); //자기 자신의 메서드에 접근할 때는 클래스 이름 생략 가능
	
		System.out.println(Math.random());//동일한 클래스 내의 함수가 아니므로 Math.을 붙임, Math클래스가 가지고 있는 random()메소드		
		//인스턴스 메서드(instance method)://반드시 객체를 생성한 후에 메서드를 호출 할 수 있음
		MethodEx8 ob=new MethodEx8();//객체 생성 //static 안붙어 있는 함수는 객체 만들어서 호출해야 함
//      변수명     변수명= 초기화;
		ob.view2();
//      view2(); =>오류
	}
	//클래스로 만들어 낸 것:오브젝트
}
