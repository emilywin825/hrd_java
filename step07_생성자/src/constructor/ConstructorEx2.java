package constructor;

/* 생성자가 여러개일 때 다른 생성자의 호출이 가능
 * 이때 this 사용
 * 객체가 자기 자신을 참조할 때 사용하는 this는 생성자를 호출하기 위한
 * this()의 형태로 사용가능 --메소드 아님
 * this()생성자호출은 생성자에서만 가능
 * 생성자의 맨 첫 줄에서만 사용 가능
*/

public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");//4.
	}
	
	public ConstructorEx2(int num) {
		this("가나다",num);//2.
		System.out.println(num+" constructor");//6.
	}
	
	public ConstructorEx2(String str, int num) {
		this();//3.
		System.out.println(str+" "+num+" constructor");//5.
	}
	
	public static void main(String[] args) {
		new ConstructorEx2(10); //1. , 7.종료
	}
}
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		this("가나다",10);//2.
//		System.out.println("default constructor");//6
//	}
//	
//	public ConstructorEx2(String str) {
//		System.out.println(str+" constructor");//4.
//	}
//	
//	public ConstructorEx2(String str,int n) {
//		this(str);//3.
//		System.out.println(str+" "+n+" constructor");//5.
//	}
//	
//	public static void main(String[] args) {
//		new ConstructorEx2(); //1. 7.종료
//	}
//}
//----------------------------------3
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		System.out.println("default constructor");//4.
//	}
//	public ConstructorEx2(String str) {
//		 this();//3.
//		System.out.println(str+" constructor"); //5.
//	}
//	public ConstructorEx2(String str,int n) {
//		this(str);//2.
//		System.out.println(str+" "+n+" constructor");//6.
//	}
//
//	public static void main(String[] args) {
//		new ConstructorEx2("가나다",10);//1, 7.종료
//	}
//}
