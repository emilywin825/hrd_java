package test1;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		if (data < 5 || data > 10) {
			System.out.println("다시 입력하세요.");
		} else {
			if (data % 2 == 0) {
				for (int i = 1; i <= data; i++)
					sum += i;
			}
		}
		return sum;
	}
}
