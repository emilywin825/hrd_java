package methodex;
//call by name:이름만 있는 함수
public class MethodEx1 {
	//함수 문법
	//접근지정자 static 리턴값의자료형 함수명(){} <--- 함수정의
	//return값 없는 경우 void
	public static void view() {//<--- 함수정의
		System.out.println("hello"); //함수 내부에서 함수 호출 가능
		return;//제어를 호출한 곳으로 돌려줌,생략 가능
	}
	
	public static void star() {
		System.out.println("*");
	}
	
	//Main 함수
	public static void main(String[] args) {
		view();//함수 호출
		star();
		view();
		star();
		//return; 운영체제 쪽으로 돌려줌
	}
}
