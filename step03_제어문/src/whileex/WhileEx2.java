package whileex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 문제. 단을 입력 받아서 해당하는 구구단을 출력하세요
 * 
 * 단을 입력하세요 : 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 *     :
 * 7 * 9 = 63    
 * 
 */
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException
	{ BufferedReader br=
        		new BufferedReader(new InputStreamReader(System.in));
		
		int dan;
		int n=1;
		
		System.out.println("단을 입력하세요 : ");
		dan=Integer.parseInt(br.toString());
		
		while(n<=9); {
			++n; // 1+1
			System.out.println(dan+" * "+n+" = "+(dan*n));
			
		}
		
		
		
	
	}

}
