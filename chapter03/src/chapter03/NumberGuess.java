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
		
		  while(true) { System.out.print("������ �����Ͽ� ���ʽÿ�(1~100):");
		  answer=input.nextInt(); count++; 
		  if(number>answer) {
		  System.out.println("������ ������ �����ϴ�."); } 
		  else if(number<answer) {
		  System.out.println("������ ������ �����ϴ�."); }
		  else break; }
		  System.out.println("�����մϴ�. �õ�Ƚ��:"+count);
		 
		do {
			System.out.print("������ �����Ͽ� ���ʽÿ�(1~100):");
			 answer=input.nextInt(); 
			 count++; 
			 if(number>answer)
			 {System.out.println("������ ������ �����ϴ�."); }
			 else if(number<answer) 
			 { System.out.println("������ ������ �����ϴ�."); } 
		}while(answer!=number);
			System.out.println("�����մϴ�. �õ�Ƚ��:"+count);
	}
}
