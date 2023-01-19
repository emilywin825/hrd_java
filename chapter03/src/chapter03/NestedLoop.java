package chapter03;

public class NestedLoop {
	public static void main(String args[])
	{
		/*for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=10;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		for(int i=2;i<=9;i++)
		{
			for(int k=1;k<=9;k++)
			{
				System.out.print(i+"*"+k+"="+i*k+" ");
			}
			System.out.println("");
		}
	}
}
