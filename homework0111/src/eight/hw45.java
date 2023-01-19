package eight;

import java.util.Scanner;

abstract class Height{
	final public double INCH = 2.54;
	public abstract double getInch(double cm);
}

public class hw45 extends Height{

	public static void main(String[] args) {
		hw45 h=new hw45();
		Scanner sc=new Scanner(System.in);
		double d;
		System.out.print("입력(cm)를 입력하시오 : ");
		d=sc.nextDouble();
		System.out.println(d+"cm는 "+h.getInch(d)+"인치입니다.");

	}

	@Override
	public double getInch(double cm) {
		return cm/2.54;
	}
}
