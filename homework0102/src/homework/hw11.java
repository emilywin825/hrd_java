package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw11 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		char c=' ';
		System.out.print("연산자를 입력(+,-,*,/) : ");
		c=br.readLine().charAt(0);
		if(c=='+') {
			System.out.printf("%d %c %d = %d",a,c,b,a+b);
		}
		else if(c=='-') {
			System.out.printf("%d %c %d = %d",a,c,b,a-b);
		}
		else if(c=='*') {
			System.out.printf("%d %c %d = %d",a,c,b,a*b);
		}
		else if(c=='/') {
			System.out.printf("%d %c %d = %.2f",a,c,b,(double)a/b);
		}
		else {
			System.out.println("연산자 error");
		}
		
	}

}
