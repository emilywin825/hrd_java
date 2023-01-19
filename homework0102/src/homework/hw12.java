package homework;

public class hw12 {

	public static void main(String[] args) {
		int mid=Integer.parseInt(args[0]);
		int fin=Integer.parseInt(args[1]);
		int rep=Integer.parseInt(args[2]);
		int att=Integer.parseInt(args[3]);
		
		double score= ((mid+fin)/2.0)*0.6+rep*0.2+att*0.2;
		
		char c=' ';
		if((int)score>=90) c='A';
		else if((int)score<=89&&(int)score>=80) c='B';
		else if((int)score<=79&&(int)score>=70) c='C';
		else if((int)score<=69&&(int)score>=60) c='D';
		else c='F';
		
		String app ="";
		switch(c) {
		case 'A','B': app="excellent"; break;
		case 'C','D': app="good"; break;
		case 'F': app="poor"; break;
		}
		
		System.out.println("중간고사 : "+mid);
		System.out.println("기말고사 : "+fin);
		System.out.println("과제점수 : "+rep);
		System.out.println("출석점수 : "+att+"\n");
		System.out.printf("성적=%.2f\n",score);
		System.out.println("학점="+c);
		System.out.println("평가="+app);
		
	}

}
