package chapter03;
import java.util.*;
public class While {
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);
		/*int i=0; int number;
		System.out.print("���ڸ� �Է��Ͻÿ�:");
		number=input.nextInt();
		while(i<=number)
		{
			System.out.print(i+" ");
			i++;
		}*/
		/*
		 * int number,result,i; i=1; System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�:");
		 * number=input.nextInt(); while(i<=9) { result=number*i;
		 * System.out.println(number+"*"+i+"="+result); i++; }
		 */
		 int i=1; int sum=0; int number;
		 System.out.print("���� �Է�:");
		 number=input.nextInt();
		 while(i<=number) 
		 { sum+=i;
		   i++;
		 } 
		 System.out.println(sum);
	}
}
