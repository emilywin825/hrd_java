package Test01;

public class ChartTest {
	public static void main(String[] args) {
		String str = args[0]; char[] c = new char[30];
		int j = 0;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			int k=str.charAt(i);
			if (k >= 97) { //소문자이면
				k=k-32; //소문자 -> 대문자
				c[j] = (char)k;
				System.out.print(c[j]);
				j++;
			}

		}
	}
}
