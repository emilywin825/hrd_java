package object;
import java.util.Scanner;

public class ObjectEx7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trapezoid tz = new Trapezoid();
		char c = ' '; int base, top, height;
		
		do {
			// base,top,height을 입력 받기
			System.out.println("***** 사다리꼴의 넓이 구하기 *****");
			System.out.print("밑변을 입력하세요:");
			base = sc.nextInt();
			System.out.print("윗변을 입력하세요:");
			top = sc.nextInt();
			System.out.print("높이을 입력하세요:");
			height = sc.nextInt();
			tz.setTrapezoid(base, top, height);
			System.out.println(tz.toString());

			// 한번 더 실행할까요?(y/n)
			System.out.print("한번 더 실행할까요?(y/n) : ");
			c = sc.next().charAt(0);
		} while (c != 'n');
		System.out.println("수고하셨습니다.");
		sc.close();

//		tz.setBase(base);
//		tz.setTop(top);
//		tz.setHeight(height); 
//		System.out.println("Base : "+tz.getBase()+" Top : "+tz.getTop()+" Height : "+tz.getHeight());
	}

}
