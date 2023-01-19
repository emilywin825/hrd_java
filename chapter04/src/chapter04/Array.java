package chapter04;

import java.util.Scanner;

public class Array {
	public static void main(String args[])
	{
		/*
		 * Scanner input=new Scanner(System.in); int people=5; int sum=0; int[]
		 * score=new int[people];
		 * 
		 * for(int i=0;i<score.length;i++) { System.out.print("성적 입력:");
		 * score[i]=input.nextInt(); sum+=score[i]; }
		 * System.out.println("평균 성적은"+sum/people+"입니다.");
		 */
		String[] pizza= {"Pepperoni "+"Mushrooms "+"Onions "+"Sausage"};
		for(int i=0;i<pizza.length;i++)
		{
			System.out.println(pizza[i]);
		}
	}
}
