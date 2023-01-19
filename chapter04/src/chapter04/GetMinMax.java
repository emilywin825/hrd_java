package chapter04;

public class GetMinMax {
	public static void main(String args[])
	{
		int[] price= {12,3,19,6,18,8,12,4,1,19};
		int max=price[0];
		int min=price[0];
		{
			for(int i=0;i<price.length;i++)
			{
				if(max<price[i])
				{
					max=price[i];
				}
				else if(min>price[i])
				{
					min=price[i];
				}
			}
			System.out.println("최대값:"+max+"최소값:"+min);
		}
	}
}
