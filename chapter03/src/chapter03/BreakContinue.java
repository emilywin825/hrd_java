package chapter03;
//import java.util.*;
public class BreakContinue {
	public static void main(String args[])
	{
		/*
		 * Scanner input=new Scanner(System.in); int grade; int sum=0; int count=0;
		 * while(true) { System.out.print("���� �Է�:"); grade=input.nextInt(); if(grade<0)
		 * break; sum+=grade; count++; } System.out.println("������ �����:"+sum/count);
		 */
		String s="no news is good news";
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='n')
				continue; //�ٽ� ���ǹ����� 
			
			n++;
		}
		System.out.println("���忡�� �߰ߵ� n�� ����:"+n);

	}		
}
