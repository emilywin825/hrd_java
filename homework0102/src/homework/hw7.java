package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.print("a를 입력하시오 : ");
		a=Integer.parseInt(br.readLine());
		System.out.print("b를 입력하시오 : ");
		b=Integer.parseInt(br.readLine());
		
		int big=a>b?a:b;
		System.out.println("큰수 : "+big);
	}
}
