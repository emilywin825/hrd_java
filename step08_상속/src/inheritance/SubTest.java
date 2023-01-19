package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;
	public SubTest() {
		
	}
	public SubTest(String name, String addr) {
		super(name, addr); //자신이 상속받은 부모의 생성자를 호출하는 메소드 super()
		
	}
	public SubTest(String name,String addr, int age, double score) {
		super(name,addr);
		this.age=age;
		this.score=score;
	}

	@Override
	public String toString() {
		return super.toString()+"\n나이는 "+age+"이고 점수는 "+score+"입니다."; //자신이 상속받은 부모를 가리키는 참조 변수 super
	}
	
	public static void main(String[] args) {
		SuperTest ob1=new SuperTest("둘리", "강동구");
		System.out.println(ob1.toString());
		
		SubTest ob2=new SubTest("도우너", "강남구",23,85.3);
		System.out.println(ob2.toString());
		
		//이름은 도우너이고 사는곳은 강남구입니다.
		//나이는 23세이고 점수는 85,3점입니다.
	}

}
