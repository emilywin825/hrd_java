package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	
	public static int hap(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
			System.out.println(hap(a));
	}
}
