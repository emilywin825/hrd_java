package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender=' ';
		int age=0;
		double tall=0;
		
		System.out.print("Input name : ");
		name=br.readLine();
		System.out.print("Input gender : ");
		gender=br.readLine().charAt(0);
		String g=(gender=='M')?"남자":"여자";
		System.out.print("Input age : ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Input tall : ");
		tall=Double.parseDouble(br.readLine());
		System.out.println("\n--결과--");
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+g);
		System.out.println("나이 : "+age+"세");
		System.out.println("신장 : "+tall+"cm");
		
	}
}
