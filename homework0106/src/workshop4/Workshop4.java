package workshop4;

public class Workshop4 {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int[] arr = {10,20,30,40,50};
		for(int x : arr) {
			sum+=x;
		}
		avg=sum/arr.length;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}

}
