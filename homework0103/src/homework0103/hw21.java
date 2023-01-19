package homework0103;

public class hw21 {

	public static void main(String[] args) {
		int[] num={1,5,2,7,3,9,10,4,6,8};
		int hhap=0,jhap=0;
		for(int i=0;i<num.length;i++) {
			if(i%2==0) jhap+=num[i];
			else hhap+=num[i];
		}
		System.out.println("홀수방의 합= "+hhap);
		System.out.println("짝수방의 합= "+jhap);
	}
 
}
