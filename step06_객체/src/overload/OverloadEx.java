package overload;
/*
 * 오버로딩 overload method(중복 함수): 같은 이름의 함수를 여러번 구현
 * <사용 조건>
 * 1. 반드신 함수 이름이 동일
 * 2. 매개 변수의 자료형이 다르거나 개수가 달라야 함
 * 사용 이유: 함수 이름 절약 ->네이밍에 편리
*/
public class OverloadEx {
	int x=20;
	int y=15;
	
	public int max() {
		return (x>y)?x:y;
	}
	public int max(int x,int y) {
		return (x>y)?x:y;
	}
	public float max(float x,float y) {
		return (x>y)?x:y;
	}
	
	public static void main(String[] args) {
		OverloadEx ob=new OverloadEx();
		System.out.println("큰 수 : "+ob.max());
		System.out.println("큰 수 : "+ob.max(75,100));
		System.out.println("큰 수 : "+ob.max(75.3f,100.4f));
	}
	
}
