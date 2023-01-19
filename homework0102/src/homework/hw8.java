package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		System.out.print("점수입력하시오 : ");
		a=Integer.parseInt(br.readLine());
		if(a<0||a>100) System.out.println("입력오류!!");
		else System.out.println("입력된값 : "+a);
	}

}
