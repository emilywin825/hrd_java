package chapter03;
import java.util.*;
public class IfElse {
	//¦Ȧ���Ǻ�
		/*public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int number;
			System.out.print("������ �Է��Ͻÿ�:");
			number=input.nextInt();
			if(number%2==0)
			{System.out.println("¦���Դϴ�.");}
			else
			{System.out.println("Ȧ���Դϴ�.");}
		}*/
		//ū �� �Ǻ�
		/*public static void main(String args[])
		{
			int a,b;
			Scanner input=new Scanner(System.in);
			System.out.print("ù��° ����:");
			a=input.nextInt();
			System.out.print("�ι�° ����:");
			b=input.nextInt();
			if(a>b)
			{
				System.out.println("ū ����"+a);
			}
			else if(a<b)
			{
				System.out.println("ū ����"+b);
			}
		}*/
		//������ ���
		/*
		 * public static void main(String args[]) { Scanner input=new
		 * Scanner(System.in); final int goal=1000; int per; int bon; String result;
		 * 
		 * System.out.print("������ �Է��Ͻÿ�:"); per=input.nextInt();
		 * 
		 * if(per>=goal) { result="���� �޼�"; bon=(per-goal)/10; } else { result="���� �޼�����";
		 * bon=0; } System.out.println(result+"\n"+"���ʽ�:"+bon); }
		 */
		//�λ縻 ����ϱ�
		 public static void main(String args[]) 
		 { 
			Date date=new Date();
			int currentHour=date.getHours(); 
			Scanner input=new Scanner(System.in);
			input.close();
			System.out.println("����ð���:"+date);

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
