package chapter03;
import java.util.*;
public class Switch {
	/*
	 * public static void main(String args[]) { Scanner input=new
	 * Scanner(System.in); int grade; String score; int number;
	 * System.out.println("������ �Է��Ͻÿ�:"); grade=input.nextInt(); number=grade/10;
	 * switch(number) { case 10: score="���� A+"; break; case 9: score="B"; break;
	 * case 8: score="c"; default: score="�й�"; break; }
	 * System.out.println("����:"+score); }
	 */
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String Month;
		System.out.print("���� �̸��� �Է��Ͻÿ�:");
		Month=input.next();
		input.close();
		int Monthnumber=0;
		switch (Month)
		{
		case "November":
			Monthnumber=11;
			break;	
		}
		System.out.println(Monthnumber+"��");}
	/*
	 * public static void main(String args[]) { int Month; int date=0; Scanner
	 * input=new Scanner(System.in); System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�:");
	 * Month=input.nextInt();
	 * 
	 * switch(Month) { case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	 * date=31; break; case 4: case 6: case 9: case 11: date=30; break; case 2:
	 * date=28; break;} System.out.println("���� ������"+date); }
	 */

}
