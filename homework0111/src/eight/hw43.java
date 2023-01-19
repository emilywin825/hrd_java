package eight;

class Circle {
	protected int r;
	protected double size;
	final protected double PI=3.141592;

	public Circle(int r) {
		this.r=r;
	}

	public void compute() {
		
	}

	public void output() {

	}
}

class CircleArea extends Circle {
	public CircleArea(int r) {
		super(r);
	}

	public void compute() {
		size=r*r*PI;
	}

	public void output() {
		System.out.println("원의 넓이 : "+size);
	}
}

class CircleRound extends Circle {
	public CircleRound(int r) {
		super(r);
	}

	public void compute() {
		size=r*2*PI;
	}

	public void output() {
		System.out.println("원의 둘레 : "+size);
	}
}

public class hw43 {
	public static void main(String[] args) {
		CircleArea ob1 = new CircleArea(10);
		CircleRound ob2 = new CircleRound(10);
		ob1.compute();
		ob1.output();
		ob2.compute();
		ob2.output();

	}
}
