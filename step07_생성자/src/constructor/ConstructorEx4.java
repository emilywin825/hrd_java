package constructor;
/*
 * 클래스명:ConstructorEx4
 * x:int
 * y:int
 * +ConstructorEx4();
 * +calc():int    <==x*y를 리터
 * +display()void <==출력하기
 * 
 * */

import java.io.Console;
import java.util.Scanner;

public class ConstructorEx4 {
	int x; int y;
	public ConstructorEx4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		x=sc.nextInt();
		System.out.print("세로를 입력 : ");
		y=sc.nextInt();
	}
	public int calc() {
		return x*y;
	}
	
	public void display() {
		System.out.println("사각형의 넓이 : "+calc());
	}
	
	public static void main(String[] args) {
		new ConstructorEx4().display();
		
	}

}
