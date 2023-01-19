package step02_연산자;
/*
 * ASCII(7bit) 미국 정보 교환용 표준 코드 (0~127까지의 값에 문자를 매핑)
 * A 65 -- 1000001
 * a 97
 */
public class AsciiCode {

	public static void main(String[] args) {
		
		System.out.println('A' + " : " + (int)'A');
		System.out.println('a' + " : " + (int)'a');
		
//		System.out.println('가' + " : " + (int)'가');

		System.out.println(65 + " : " + (char)65);
		System.out.println(97 + " : " + (char)97);
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println('A'+1); //char+int==>int
		System.out.println((char)('A'+1)); //B
		System.out.println("A"+1); //String+int==>String 연결
		
		//대소문자 변환 : ctrl+shift+x ctrl+shift+y
		
		System.out.println('a'-32); //65
		System.out.println((char)('a'-32)); //A
		
		System.out.println('a'+'b'); //char+char==>int
		System.out.println((char)('a'+'b'));
		System.out.println("♡");
	}

}
