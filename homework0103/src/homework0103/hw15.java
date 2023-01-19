package homework0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw15 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=0,count=0; char c=' ';
		
		int a=(int)(Math.random() * 90) + 10;
		
		System.out.println("*** 난수가 발생하였습니다.맞추어 보세요.*** ");
		do {
		System.out.print("숫자 입력 : ");
		number=Integer.parseInt(br.readLine());
		if(a>number) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
		}
		else if(a<number) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
		}
		}while(a!=number);
		count++;
		System.out.println("추카추카"+count+"번만에 맞추셨습니다.");
		System.out.println("종료하시겠습니까? (y/n)");
		c=br.readLine().charAt(0);
		if(c=='y') System.out.println("y");
		if(c=='n') System.out.println("n");
	}
}
