package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw9 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c=' ';
		System.out.print("Input Character: ");
		c=br.readLine().charAt(0);
		if(c>=65&&c<=90) System.out.printf("result : %c",c+32 );
		else if(c>=97&&c<=122) System.out.printf("result : %c",c-32);
		else System.out.print("입력데이터 오류");
		//97-122
	}

}
