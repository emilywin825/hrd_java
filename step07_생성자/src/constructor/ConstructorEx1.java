package constructor;

public class ConstructorEx1 {
	//생성자:객체 생성을 담당-->컴퓨터에서 사용 가능하도록 메모리에 실체화
	// 인스턴트가 생성될 때 호출되는 인스턴스 초기화(=인스턴스 변수들을 초기화하는 것)
	
	public ConstructorEx1() {
		System.out.println("default constructor");
	}
	public ConstructorEx1(String str) {
		System.out.println(str+" constructor");
	}
	public ConstructorEx1(String str,int n) {
		System.out.println(str+" "+n+" constructor");
	}
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1("가나다");
		new ConstructorEx1("가나다",2);
	}
}
