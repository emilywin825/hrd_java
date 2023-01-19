package constructor;
//홍길동의 점수는 253점이며 평균은 84.33점이고 학점은 B입니다.
//이름 : 민들레 <==매개변수 4개 생성자를 사용하여 객체 생성하고 대입한 후  getter를 이용하여 출력        
//국어 : 95
//영어 : 85
//수학 : 73
//총점 : 253
//평균 : 84.33
//학점 : B
public class ConstructorEx6 {

	public static void main(String[] args) {
		Student st=new Student("민들레",95,85,73);
		System.out.println(st.getName());
		System.out.println(st.getKor());
		System.out.println(st.getEng());
		System.out.println(st.getMat());
		System.out.println(st.getTotal());
		System.out.println(String.format("%.2f",st.getAvg()));
		System.out.println(st.getgrade());
		
		
//		st.setName("홍길동");
//		st.setKor(95);
//		st.setEng(85);
//		st.setMat(73);
//		System.out.println(st.toString());
	}

}
