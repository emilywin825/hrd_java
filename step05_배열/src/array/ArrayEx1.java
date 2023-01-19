package array;

//배열:동일한 자료형의 연속된 기억공간
//장점: 속도가 빠름

//1차원 배열
public class ArrayEx1 {

	public static void main(String[] args) {
		//자료형[] 변수명={값1,값2,...,값n};
		//int[] num= {100,200,300,400};
		
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		
//		for(int i=0;i<=num.length-1;i++) {
//			System.out.println(num[i]);
//		}
		//역순 출력
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		//향상된 for문
		for(int s:num) {
			System.out.println(s);
		}
	}

}
