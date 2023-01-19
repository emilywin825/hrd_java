package inheritance;

public class SuperTest {
	private String name;
	private String addr;
	public SuperTest() {
		
	}
	public SuperTest(String name, String addr) {
		super(); //object 클래스의 생성자 호출 (생략 가능)
		this.name=name;
		this.addr=addr;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+"이고 사는곳은 "+addr+"입니다.";
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
