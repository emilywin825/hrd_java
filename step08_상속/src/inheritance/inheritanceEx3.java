package inheritance;
//super : 자식 객체의 생성자에서 부모 객체의 생성자를 호출할 때 사용하는 키워드
class Branch{
	public Branch() {
		System.out.println("Branch default constructor");//5
	}
	
	public Branch(String str) {
		this();//4
		System.out.println(str+" Branch constructor");//6
	}
}

class Leaf extends Branch {
	public Leaf() {
		super("마바사");//3
		System.out.println("Leaf default constructor");//7
	}
	public Leaf(String str, int n) {
		super(str);//2
		System.out.println(str+" "+n+" Leaf default constructor");//8
	}
}

public class inheritanceEx3 {

	public static void main(String[] args) {
		new Leaf("가나다",2); //1 ,9종료
	}	
}

//------------------------------------------------------------
//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");//4
//	}
//	
//	public Branch(String str) {
//		this();//3
//		System.out.println(str+" Branch constructor");//5
//	}
//}
//
//class Leaf extends Branch {
//	public Leaf(String str) {
//		super(str);//2
//		System.out.println(str+"Leaf default constructor");//6
//	}
//}
//
//public class inheritanceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf("~hi"); //1 7.종료
//	}	
//}
//--------------------------------------------------------------
//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");//4
//	}
//	
//	public Branch(String str) {
//		this();//3
//		System.out.println(str+" Branch constructor");//5
//	}
//}
//
//class Leaf extends Branch {
//	public Leaf() {
//		super("hi~");//2
//		System.out.println("Leaf default constructor");//6
//	}
//}
//
//public class inheritanceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf(); //1 7.종료
//	}
//	
//}
