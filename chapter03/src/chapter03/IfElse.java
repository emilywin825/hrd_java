package chapter03;
import java.util.*;
public class IfElse {
	//짝홀수판별
		/*public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int number;
			System.out.print("정수를 입력하시오:");
			number=input.nextInt();
			if(number%2==0)
			{System.out.println("짝수입니다.");}
			else
			{System.out.println("홀수입니다.");}
		}*/
		//큰 수 판별
		/*public static void main(String args[])
		{
			int a,b;
			Scanner input=new Scanner(System.in);
			System.out.print("첫번째 정수:");
			a=input.nextInt();
			System.out.print("두번째 정수:");
			b=input.nextInt();
			if(a>b)
			{
				System.out.println("큰 수는"+a);
			}
			else if(a<b)
			{
				System.out.println("큰 수는"+b);
			}
		}*/
		//성과급 계산
		/*
		 * public static void main(String args[]) { Scanner input=new
		 * Scanner(System.in); final int goal=1000; int per; int bon; String result;
		 * 
		 * System.out.print("실적을 입력하시오:"); per=input.nextInt();
		 * 
		 * if(per>=goal) { result="실적 달성"; bon=(per-goal)/10; } else { result="실적 달성못함";
		 * bon=0; } System.out.println(result+"\n"+"보너스:"+bon); }
		 */
		//인사말 출력하기
		 public static void main(String args[]) 
		 { 
			Date date=new Date();
			int currentHour=date.getHours(); 
			Scanner input=new Scanner(System.in);
			input.close();
			System.out.println("현재시각은:"+date);

			if(currentHour<12)
			{
				System.out.println("Good morning");
			}
			else
			{
				System.out.println("Good night");
			}
		}
}
