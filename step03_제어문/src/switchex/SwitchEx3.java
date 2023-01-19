package switchex;
/* args로 입력된 month로 날짜를 구하세요
 * $ java SwitchEx3
 * 
 * 3월은 31일까지 있습니다
 */

public class SwitchEx3 {

	public static void main(String[] args) {
      
		int month=Integer.parseInt(args[0]);
		int day=0; //0으로 초기화

		switch(month) {
		//code here
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: day=31; break;
		case 2: day=28;  break;
		default: day=30; break;
		
		}
		System.out.println(month+"월은 "+day+"일까지 있습니다");
	}

}
