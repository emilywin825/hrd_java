  package chapter03;
import java.util.*;
public class DoWhile {
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);
		/*
		 * int month; do {System.out.print("올바른 월을 입력하시오 [1-12]:");
		 * month=input.nextInt(); }while(month<1|month>=13);
		 * System.out.println("사용자가 입력한 월은"+month);
		 */
		//약수 구하기
		/*
		 * int num; System.out.print("num:"); num=input.nextInt(); for(int i =
		 * 1;i<=num;i++) { if(num%i==0) { System.out.println(i); } }
		 */
		/*
		 * int sum=1; int number; System.out.println("숫자를 입력:"); number=input.nextInt();
		 * for(int i=1;i<=number;i++) { sum*=i; } System.out.println(sum);
		 */
		input.close();
	}
}
