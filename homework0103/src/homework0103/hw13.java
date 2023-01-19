package homework0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int year;
		System.out.print("연도 입력 : ");
		year=Integer.parseInt(br.readLine());
		String s=year%4==0||year%100==0||year%400==0?"윤년":"평년";
		System.out.println(s);
	}

}
