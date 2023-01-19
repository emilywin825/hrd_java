package chapter04;
import java.util.*;
public class MovieBook {
	public static void main(String args[])
	{
		 int sitnu;
		 int numberarray=10;
		 int[] number=new int[numberarray];
		
		   while(true){
			  System.out.println("----------------------------------");
			  for(int i=1;i<=10;i++)
			  {
				 System.out.print(i);
			  }
			  System.out.println("\n"+"----------------------------------");
			  for(int i=0;i<number.length;i++)
			  {
				 System.out.print(number[i]+"  ");
			  }
			  System.out.println("\n"+"----------------------------------");
			 
			  System.out.print("원하시는 좌석번호를 입력하세요.(종료는 -1): ");
			  Scanner input=new Scanner(System.in);
			  sitnu=input.nextInt();
			  
			  if(sitnu==-1)
			  {
			System.out.println("종료되었습니다."); break;}
			  
			  if(number[sitnu-1]==0)
			  {
			  System.out.println("예약되었습니다.");
			  number[sitnu-1]=1;
			  }
			  else if(number[sitnu-1]==1)
			  {
				  System.out.println("이미 예약된 좌석입니다. 다시 시도해주세요.");
			  }
		   }
	}
}
