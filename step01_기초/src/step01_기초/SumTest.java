package step01_기초;

/*
 * +기호의 의미
 * 1. 더하기
 * 2. 연결하기
 * 3. 단항연산자 (부호, ++)
 * 
 */

public class SumTest {

	public static void main(String[] args) {
	
		int a=5, b=7;
		System.out.println("a는 "+a+" b는 "+b);
		System.out.println("a는 "+a+", b는 "+b);
		//서로 다른 자료형일 때 +는 연결의 의미
		System.out.println(a+b); // 더하기 
		System.out.println("a+b="+(+a+b));
		System.out.println(a+"+"+b+"="+(+a+b));

	}
	
}
