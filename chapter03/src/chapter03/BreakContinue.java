package chapter03;
//import java.util.*;
public class BreakContinue {
	public static void main(String args[])
	{
		/*
		 * Scanner input=new Scanner(System.in); int grade; int sum=0; int count=0;
		 * while(true) { System.out.print("점수 입력:"); grade=input.nextInt(); if(grade<0)
		 * break; sum+=grade; count++; } System.out.println("점수의 평균은:"+sum/count);
		 */
		String s="no news is good news";
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='n')
				continue; //다시 조건문으로 
			
			n++;
		}
		System.out.println("문장에서 발견된 n의 개수:"+n);

	}		
}
