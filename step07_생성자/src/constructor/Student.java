package constructor;

/*
 * -name:String -kor:int -eng:int -mat:int
 * +Student()
 * +Student(-name:String, -kor:int, -eng:int, -mat:int)
 * +setter & getter
 * +toString():String
 * 
 * +getTotal():int <==kor+eng+mat를 리턴
 * +getAvg():double<==getTotal()을 3으로 나누어 평균 구하기
 * +getGrade():char<==getAvg()를 이용해 A B C D F 학점 구하기 (switch 사용)
 * */

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	Student(){
		
	}
	Student(String name,int kor,int eng,int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String toString() {
		return name+"의 점수는 "+getTotal()+" 평균은 "+String.format("%.2f",getAvg())+" 점이고 학점은 "+getgrade()
		+"입니다.";
	}
	public int getTotal()
	{
		return kor+eng+mat;
	}
	public double getAvg()
	{
		return (double)getTotal()/3;
	}
	public char getgrade(){
		int sc=(int)getAvg()/10;
		switch(sc) {
		case 10 : 
		case 9 : return 'A';
		case 8 : return 'B';
		case 7 : return 'C';
		case 6 : return 'D';
		default : return 'F';
		}
	}
	
}
