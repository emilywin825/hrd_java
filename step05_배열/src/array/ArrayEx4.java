package array;

/*args로 세 수를 입력 받아서 최대값, 최소값을 출력
 * 
 * $java ArrayEx4 10 15 23
 * 
 * 최대값:23
 * 최소값:10
 * */
public class ArrayEx4 {

	public static void main(String[] args) {
//		System.out.println(args[0]);

		int[] num = new int[3];
		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		num[2] = Integer.parseInt(args[2]);

		int max = num[0], min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i])
				max = num[i];
			if (min > num[i])
				min = num[i];
		}
		System.out.printf("최대값 : %d " + ", 최소값 : %d", max, min);
	}
}