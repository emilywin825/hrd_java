package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * A값을 입력하세요 : 15
 * B값을 입력하세요 : 10
 * 
 * 15 + 10 = 25
 */


public class InputTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		InputStreamReader isr= InputStreamReader(System.in);
//
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
	    System.out.print("A값을 입력하세요 : ");
	    a=Integer.parseInt(br.readLine());
	    
	    System.out.print("B값을 입력하세요 : ");
	    b=Integer.parseInt(br.readLine());
	   
		

	}

}
