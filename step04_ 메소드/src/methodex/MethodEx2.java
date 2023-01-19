package methodex;

//call by name:이름만 있는 함수
public class MethodEx2 {

	public static int view1() {
		return 10;// 2.
	}

	public static char view2() {
		return 'A';
	}
	
	public static float view3() {
		return 3.14f; //대입하는 변수가 double형이면 f안붙여도 됨
	}
	
	public static double view4() {
		return 50.3;
	}
	
	public static String view5() {
		return "hello";
	}
	public static boolean view6() {
		return true;
	}
	public static void main(String[] args) {
		int a = view1();// 1.함수 호출 3.a에 대입
		System.out.println(a);// 4.
		char b = view2();
		System.out.println(b);
		System.out.println(view3());
		System.out.println(view4());
		String c=view5();
		System.out.println(c);
		System.out.println(view5());
		System.out.println(view6());
		//출력될때는 문자열로 변환되서 출력
	}
}
