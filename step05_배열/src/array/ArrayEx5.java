package array;
/* 크기가 5개인 정수형 배열을 만들고 배열에 데이터르 입력을 받아서 출력하고
 * 최대값,최소값을 구하세요.
 * ar[0]의 값을 입력 : 25
 * ar[1]의 값을 입력 : -34
 * ar[2]의 값을 입력 : 
 * ar[3]의 값을 입력 : 
 * ar[4]의 값을 입력 :  
 * 
 * 25,-34, ...
 * 최대값:25
 * 최소값:-34
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ar = new int[5];
		//int max,min;
		for (int i = 0; i < ar.length; i++) {
			System.out.print("ar[" + i + "]의 값을 입력: ");
			ar[i] = Integer.parseInt(br.readLine());
		}
		int max = ar[0], min = ar[0];
		//max=ar[0];min=ar[0];
		for (int i = 0; i < ar.length; i++) {
			System.out.print("ar[" + i + "]:" + ar[i]);
			if (ar[i] > max)
				max = ar[i];
			if (ar[i] < min)
				min = ar[i];
			if(i==4) break;
			System.out.print(", ");
		}
		System.out.println("\n");
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}