package inheritance;

class SuperEx{
	 public void show() {
		 System.out.println("show1 method");
	 }
}

class SubEx extends SuperEx{
	public void show() {
		super.show();
		System.out.println("show2 method");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		SubEx se=new SubEx();
		se.show();
	}

}

//----------------------------------------------
//class SuperEx{
//	 public void show1() {
//		 System.out.println("show1 method");
//	 }
//}
//
//class SubEx extends SuperEx{//상속 관계
//	public void show2() {
//		System.out.println("show2 method");
//	}
//}
//
//public class InheritanceEx1 {
//
//	public static void main(String[] args) {
//		SubEx ob2=new SubEx();
//		ob2.show1();
//		ob2.show2();
//		
//		SuperEx ob=new SuperEx();
//		ob.show1();
//	}
//
//}
