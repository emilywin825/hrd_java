package eight;

import java.util.Scanner;

abstract class Shape {
	private int Data1;
	private int Data2;

	public Shape(int Data1, int Data2) {
		super();
		this.Data1 = Data1;
		this.Data2 = Data2;
	}

	public int getData1() {
		return Data1;
	}

	public int getData2() {
		return Data2;
	}

	public void setData1(int Data1) {
		this.Data1 = Data1;
	}

	public void setData2(int Data2) {
		this.Data2 = Data2;
	}

	public abstract double getArea();

}

class Triangle extends Shape {
	public Triangle(int data1, int data2) {
		super(data1, data2);
	}

	public double getArea() {
		return getData1() * getData2() * 0.5;
	}
}

class Rectangle extends Shape {
	public Rectangle(int data1, int data2) {
		super(data1, data2);
	}

	public double getArea() {
		return getData1() * getData2();
	}
}

public class hw46 {

	public static void main(String[] args) {
		Shape ob = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.삼각형 2.사각형 3.종 료\n 선택(1-3) : ");
			int n = sc.nextInt();
			int data1, data2;
			switch (n) {
			case 1:
				System.out.print("밑변 : ");
				data1 = sc.nextInt();
				System.out.print("높이 : ");
				data2 = sc.nextInt();
				ob = new Triangle(data1, data2);
				System.out.println(ob.getArea()); break;
			case 2:
				System.out.print("가로 : ");
				data1 = sc.nextInt();
				System.out.print("세로 : ");
				data2 = sc.nextInt();
				ob = new Rectangle(data1, data2);
				System.out.println(ob.getArea()); break;
			case 3:
				System.out.println("종료!");
				System.exit(0);
			}
		}
	}
}
