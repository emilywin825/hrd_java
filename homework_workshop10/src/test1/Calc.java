package test1;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		if (data >= 5 && data <= 10) { 
				for (int i = 2; i <= data; i+=2) {
					sum += i;}
				return sum;

		} else {
			System.out.println("다시 입력하세요.");
			return -1;
		}
		
	}
}
