 package object;
//클래스 다이어그램
/* -:private, +:public, #:protected
 * 클래스명:Person
 * +name:String
 * +age:int
 * +score:float
 * 
 * +setPerson(n:String, a:int, s:float):void
 * +viewPerson():void
 * 
 * */
//한 파일에 여러 클래스 만들경우 보통 메인 함수 있는 클래스에 static 붙임
class Person{
	public String name; //멤버 변수(field), 전역변수(클래스 내부에서 사용할 수 있는 변수)
	public int age;
	public float score;
	
	public void setPerson(String name, int a, float s) {
		//멤버함수, 메서드(method)
		this.name=name; // 자기자신임을 나타내는 this
		age=a;
		score=s;
		//nameS="크롱";
		//age=2;
	}
	
	public void viewPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
	}
}

public class ObjectEx1 {
	public static void main(String[] args) { 
		Person ob1=new Person();//객체 생성
		//new Person: 힙 영역에 메모리를 할당하고 인스턴스 생성
		//객체:인스턴스, 필드와 메서드의 조합
		ob1.setPerson("뽀로로",23,78.3f);
		ob1.viewPerson();
		//System.out.println(ob1.hashCode()); hashCode()->객체이 참조주소를 10진 정수로 리턴
		
		Person ob2=new Person();
		ob2=new Person();
		ob2.setPerson("크롱", 20, 55.5f);
		ob2.viewPerson();
		//System.out.println(ob1.hashCode());
		//ob2.name="루피";//외부에서 변수에 직접 접근은 자제...
	}
}