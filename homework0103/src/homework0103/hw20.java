package homework0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x,y,gop=1;
		System.out.print("x값을 입력하시오: ");
		x=Integer.parseInt(br.readLine());
		System.out.print("y값을 입력하시오: ");
		y=Integer.parseInt(br.readLine());
		for(int i=1;i<=y;i++) {
			gop*=x;
		}
		System.out.println(x+"의 "+y+"승은 "+gop+"입니다.");
	}
 
}
