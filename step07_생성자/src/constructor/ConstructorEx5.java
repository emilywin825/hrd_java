package constructor;

import java.util.Scanner;

/*
 * 문제. 생성자에서 두 수를 입력 받아서 큰수와 작은수를 출력하세요.
 * show()에서 maxValue(), minValue()를 호출하세요
 * 클래스명 : Max
 * -a:int
 * -b:int
 * +Max()
 * +maxValue():int
 * +minValue():int
 * +show():void
 * 
 * 출력결과
 * input a : 5
 * input b :  3
 * 
 * 큰 수 : 5
 * 작은 수 : 3
 * */
class Max{
	private int a;
	private int b;
	public Max(){ //입력받아서 값을 초기화
		Scanner sc=new Scanner(System.in);
		System.out.print("a를 입력 : "); a=sc.nextInt();
		System.out.print("b를 입력 : "); b=sc.nextInt();
		sc.close();
	}
	public int maxValue() {
		return a>b?a:b;
	}
	public int minValue() {
		return a>b?b:a;
	}
	public void show() {
		System.out.println("input a : "+a);
		System.out.println("input b : "+b);
		System.out.println("큰 수 : "+maxValue());
		System.out.println("작은 수 : "+minValue());
	}
}
public class ConstructorEx5 {

	public static void main(String[] args) {
		Max m = new Max(); //a,b,maxValue(),minValue()를 가진 공간을 기억공간에 할당
		m.show();	
	}
}
//String name="이순신"; == String name=new String("이순신");
