package homework;

public class hw5 {

	public static void main(String[] args) {
		String name="민들래";
		int kor=90; 
		int eng=70; 
		int mat=75;
		int hap=kor+eng+mat;
		double avg=hap/3.0;
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+hap+"점");
		System.out.printf("평균점수 : %.1f",avg);
	}

}
