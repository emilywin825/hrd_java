package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제. 중첩 if를 이용하여 프로그램을 작성하세요
 * 3개 과목의 점수를 입력 받아서 합격인지 불합격인지 출력하세요
 * 3개 과목이 전부 40점 이상어야 하고 평균 60이상이면 "합격"
 * 평균이 60이 넘지만 1과목이라도 40점 미만이면 "과락으로 불합격"
 * 평균이 60 미만이면 "불합격"
 * 
 * --출력 결과--
 * 국어점수입력 : 95
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 합격
 * 
 * 국어점수입력 : 35
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 과락으로 불합격
 * 
 * 국어점수입력 : 45
 * 영어점수입력 : 55
 * 수학점수입력 : 22
 * 결과 : 불합격
 * 
 */

public class ifEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int kor, eng, mat, tot;
		double avg;

		System.out.println("국어점수입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.println("영어점수입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.println("수학점수입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;

		System.out.println("결과 : ");

		if (avg < 60) {
			System.out.println("불합격");
		} else {
			// 평균이 60이상인 상황
			if (kor >= 40 && eng >= 40 && mat >= 40) {
				System.out.println("합격");
			} else {
				System.out.println("과락으로 불합격");

//		if(avg>=60) {
//			if(kor<40 || eng<40 || mat<40) {
//				System.out.println("과락으로 불합격"); {
//			}else {
//				System.out.println("합격");
//			}
//				else {
//			//60미만일 때는 불합격
//			System.out.println("불합격");
			}

		}

	}
}
