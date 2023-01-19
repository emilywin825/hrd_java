package chapter04;
import java.util.*;
public class RollDice {
	public static void main(String args[])
	{
		int size=6;
		int[] number=new int[size];
		System.out.println("================="+"\n"+"면   빈도"+"\n"+"=================");
		for(int i=0;i<10000;i++) 
		{ ++number[(int)(Math.random()*size)];}//Math.random()은 0.0~1 사이의 난수 생성 후 6곱하고 정수로 형변환
		
		for(int i=0;i<size;i++)
		{
			System.out.println(""+ (i + 1)+ "   " + number[i]);
		}
	}
}
