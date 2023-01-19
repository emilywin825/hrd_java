package chapter04;
import java.util.*;
public class SeqSearch {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int r;
		int[] list= {0,10,20,30,40,50,60,70,80,90,100};
		System.out.print("탐색할 값을 입력하시오:");
		r=input.nextInt();
		for(int i=0;i<list.length;i++)
		{
			if (r==list[i])
			{
				System.out.println(r+"값은 "+i+"위치에 있습니다.");
			}
		}
		
	}

}
