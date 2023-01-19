package step01_기초;

/* System.out.printf("메세지 or 제어문자", 변수1, 변수2,...)
 * ** 제어문자 **
 * %s
 * %d int 점수, char 문자
 * %c char
 * %f double, float 실수값들...
 * 
 */

public class DataType2 {

	public static void main(String[] args) {
          String name= "이순신";
		  String dept= "개발부";
		  char gerder= 'M';
		  double score=85.3;
		  float tall=183.4f;
		  int age=25;
		  
		  System.out.printf("이름 : %s\n", name);
		  System.out.printf("부서 : %s\n", dept);
		  
	      System.out.printf("성별 : %s\n", gerder);
		  System.out.printf("점수 : %.2f점\n", score);
		  System.out.printf("점수 : %10.1f점\n", score);
		  System.out.printf("점수 : %-10.1f점\n", score);
		  System.out.printf("신장 : %.2fcm\n", tall);
		  System.out.printf("나이 : %-10d세\n", age);

		  
//		  System.out.println("이름 : "+name);
//		  System.out.println("부서 : "+dept);
		  
	}

}
