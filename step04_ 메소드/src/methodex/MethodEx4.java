package methodex;

public class MethodEx4 {
	public static int total(int k,int e,int m) {
		return k+e+m;
	}
	
	public static double avg(int total) {
		return total/3.0;
	}
	
	public static char grade(double avg) {
		switch((int)avg/10){
		case 10:
			return 'A';
		case 9:
			return 'B';
		case 8:
			return 'C';
		case 7:
			return 'D';
		default: 
			return 'F';
		}
	}
	
	public static String result(char grade) { //char grade='C';
		if(grade=='F') return "불합격";
		else return "합격";
	}
	
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("총점 : "+total(k,e,m)); //total(95,85,73)전달
		System.out.printf("평균 : %.2f\n",avg(total(k,e,m))); //total(k,e,m)이 하나의 값, avg(253)
		System.out.println("학점 : "+ grade(avg(total(k,e,m))));
		System.out.println("결과 : "+result(grade(avg(total(k,e,m)))));//result('C')
	}
}
