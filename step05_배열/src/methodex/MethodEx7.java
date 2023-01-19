package methodex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//call by reference : 참조에 의한 호출
public class MethodEx7 {

	public static void view1(String str) {
		System.out.println(str);
		str="hello";
	}
	
	public static void view2(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");//배열의 참조 주소를 찎음
			System.out.println();
			num[0]=100;
		}
	}
	
	public static void main(String[] args) {
		String str="happy";
		view1(str);
		System.out.println(str);
		
		int[] num= {10,20,30,40,50};
		view2(num);
		for(int x:num) {
			System.out.println(x+" ");
		}
	}
}
