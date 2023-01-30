package stringex_01_11;

import java.util.StringTokenizer;

//token(토큰) : 더 이상 분해할 수 없는 의미를 가지는 단위

public class StringTokenizerEx {

	public static void main(String[] args) {
		String str="학교,집,학원,게임방,술집,도서관";
		String[] value=str.split(","); //split(a) --> a기준으로 문자열 자르기
		
		for(String x:value) {
			System.out.println(x);
		}
//-----------------------------------------------------------------
		String str2="학교,#집$,학원,게임방송@,술집,도서관";
		
		StringTokenizer tokens=new StringTokenizer(str,",#$@"); //구문자 : ,#$@
		//파싱 : 원본 데이터에서 필요한 데이터를 추출하는 것
		System.out.println("파싱할 문자열의 수 : "+tokens.countTokens()+"개");
		
		while(tokens.hasMoreElements())
			System.out.println(tokens.nextElement());
		
	}

}
