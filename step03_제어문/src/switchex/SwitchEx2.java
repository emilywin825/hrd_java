package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제.
 * 숫자를 입력하세요 : 5
 * 
 * 5는 홀수입니다
 * 
 */
//switch의 조건식은 정수값이 나오도록 작성
public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException,IOException{
        //입력 -- BufferedReader
		BufferedReader br=
	    		new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.println("숫자를 입력하세요 : ");
		num=Integer.parseInt(br.readLine());
		
		
		//계산, 결과출력 --switch
		
		switch(num%2) {
		case 0: System.out.println(num+"는 짝수입니다"); break;
		default: System.out.println(num+"는 홀수입니다"); break;
		}
		
	
	}

}
