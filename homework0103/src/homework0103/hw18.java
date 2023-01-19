package homework0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단을 입력하시오 : ");
		int i=Integer.parseInt(br.readLine());
		for(int j=1;j<=9;j++) {
			System.out.printf("%d * %d= %d              %d * %d= %d\n",i,j,i*j,i+1,j,(i+1)*j);
		}
		
	}

}
