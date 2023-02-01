package test2;

public class MonthsTest {

	public static void main(String[] args) {
		Months mon = new Months();
		String m=args[0];
		int n=mon.getDatys(Integer.parseInt(m));
		if(n==0) System.out.println("입력된 값이 잘못 되었습니다");
		else System.out.println("입력받은 월 : "+Integer.parseInt(args[0])+"월\n마지막 일자 : "+n+"일");
	}

}
