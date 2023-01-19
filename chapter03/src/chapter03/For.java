package chapter03;
import java.util.*;
public class For{
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);
		Random generator=new Random();
		int number;
		System.out.print("난수의 개수:");
		number=input.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			int r=generator.nextInt(100);//1~99 사이의 난수를 생성
			System.out.println("난수"+i+":"+r);
			sum+=r;
			count++;
		}
		System.out.println("난수"+count+"개의 합은"+sum);
		input.close();
	}
}