package baekjoon;
import java.util.*;
public class baekjoon{
    public static void main(String args[])
    {
//        Scanner input=new Scanner(System.in);
//        int a,b;
//        System.out.println("�� ���� �Է�(0 < A, B < 10):");
//        a=input.nextInt();
//        b=input.nextInt();
//        System.out.println(a+b);

    	        Scanner sc=new Scanner(System.in);
    	        int A=472;
    	        int B=385;
    	 
    	        System.out.println(A*(B%10));
    	        System.out.println(A*((B/10)%10));
    	        System.out.println(A*(B/100));
    	        System.out.println(A*B);
    	        

    }
}