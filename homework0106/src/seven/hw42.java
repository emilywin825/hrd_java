package seven;

import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class Health{
	public char gender;
	public double tall;
	public double weight;
	Scanner sc=new Scanner(System.in);
	public Health() {
		input();
	}
	public void input(){
		System.out.print("성별(M/F)을 입력하시오: ");
		gender=sc.next().charAt(0);
		System.out.print("신장(Cm)을 입력하시오: ");
		tall=sc.nextDouble();
		System.out.print("체중(Kg)을 입력하시오: ");
		weight=sc.nextDouble();
	}
	
	public String output() {
		return "성별: "+gender+"\n신장: "+tall+"\n체중: "+weight;
	}
}

public class hw42 extends Health{
	private double fat; //비만도
	private String result;
	double aveweight=0; //표준체중
	public hw42() {
		super();
		calculate();
	}
	public void calculate() {
		if(gender=='M')
			aveweight=(tall-100)*0.9;
		else if(gender=='F')
			aveweight=(tall-100)*0.85;
		fat=weight/aveweight*100;
		
		if(fat<=90) result="저체중";
		else if(fat>=90&&fat<=110) result="정상(표준체중)";
		else if(fat>=111&&fat<=120) result="과체중";
		else if(fat>=121&&fat<=130) result="경도비만";
		else if(fat>=131&&fat<=150) result="중도비만";
		else if(fat>=150) result="고도비만";
	}
	public String output() {
		return super.output()+"\n결과: 당신의 비만도 "+String.format("%.2f",fat)+"이고 "+result+"입니다.";
	}
	
	public static void main(String[] args) {
		hw42 ob=new hw42();
	    System.out.println(ob.output());
	}

}
