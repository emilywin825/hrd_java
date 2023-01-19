 package object;

import java.util.Scanner;

//입력 : BufferedReader, Scanner
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 : "); String str=sc.nextLine();
		System.out.print("정수 : "); int a=sc.nextInt();
		System.out.print("실수 : "); double b=sc.nextDouble();
		System.out.print("문자 : "); char c=sc.next().charAt(0); //nextLine()사용하면 enter때문에 오류 발생,next()사용
		sc.close();
		
		System.out.println(str);		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
 