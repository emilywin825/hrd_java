package homework;

public class hw3 {
	public static void main(String[] args) {
		int basep=1500000;
		int timep=55000;
		int tax=basep*1/10;
		int realp=basep+timep-tax;
		System.out.println("실수령액 : "+realp+"원");
	}
}
