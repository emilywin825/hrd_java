package chapter03;
import java.util.*;
public class For{
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);
		Random generator=new Random();
		int number;
		System.out.print("������ ����:");
		number=input.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			int r=generator.nextInt(100);//1~99 ������ ������ ����
			System.out.println("����"+i+":"+r);
			sum+=r;
			count++;
		}
		System.out.println("����"+count+"���� ����"+sum);
		input.close();
	}
}