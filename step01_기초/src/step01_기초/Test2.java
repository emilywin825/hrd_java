package step01_기초;
/* 문제. 4개의 변수를 만들어서 다음과 같이 완성하세요
 * (이름, 국어, 영어, 수학)
 * 
 * -- 출력 결과 --
 * 이름 :  둘리
 * 국어 : 95
 * 영어 : 85
 * 수학 : 73
 * 총점 : 253점
 */

public class Test2 {

	public static void main(String[] args) {
		String name= "둘리";
		int k=95, e=85, m=73;		

		
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+k);
		System.out.println("영어 : "+e);
		System.out.println("수학 : "+m);
		System.out.println("총점 : "+(k+e+m)+'점');
		
	}

}
