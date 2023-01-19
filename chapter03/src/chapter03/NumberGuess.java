package chapter03;
import java.util.*;
public class NumberGuess {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Random generator=new Random();
		int number=generator.nextInt(101);
		int answer;
		int count=0;
		
		  while(true) { System.out.print("정답을 추측하여 보십시오(1~100):");
		  answer=input.nextInt(); count++; 
		  if(number>answer) {
		  System.out.println("제시한 정수가 낮습니다."); } 
		  else if(number<answer) {
		  System.out.println("제시한 정수가 높습니다."); }
		  else break; }
		  System.out.println("축하합니다. 시도횟수:"+count);
		 
		do {
			System.out.print("정답을 추측하여 보십시오(1~100):");
			 answer=input.nextInt(); 
			 count++; 
			 if(number>answer)
			 {System.out.println("제시한 정수가 낮습니다."); }
			 else if(number<answer) 
			 { System.out.println("제시한 정수가 높습니다."); } 
		}while(answer!=number);
			System.out.println("축하합니다. 시도횟수:"+count);
	}
}
