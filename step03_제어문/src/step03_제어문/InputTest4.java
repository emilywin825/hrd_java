package step03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*문제. 다음과 같이 출력하세요
 * 
 * 반지름을 입력하세요 : 5
 * 원의 넓이 : 78.5  <-- 반*반*3.14
 * 원의 둘레 : 31.4  <-- 2*3.14*반
 * 
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br=
    		new BufferedReader(new InputStreamReader(System.in));
    int r;
    double size;
    
		//입력처리
		System.out.println("반지름을 입력하세요 : ");
		r=Integer.parseInt(br.readLine());
		
		//계산
//		size=3.14*r*r*r;
//		round=2*3.14*r;
//		
//		//계산 출력
//		System.out.println("원의 넓이 : %.2f\n", size);
//		System.out.println("원의 둘레 : %.2f\n", round);
	}
}
