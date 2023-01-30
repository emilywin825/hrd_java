package stringex_01_11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


//날짜 처리
public class CalendarEx {

	public static void main(String[] args) {
		System.out.println("오늘 날짜 : "+new Date());
		
		//Calendar cal=new Calendar();(x)
		Calendar cal=new GregorianCalendar();
		
		Calendar cal2=Calendar.getInstance(); //시스템에 설정된 시각
		System.out.println("오늘 날짜 : "+ cal.get(Calendar.YEAR)+"년 "+cal.get((Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일");
		//The first month ofthe year in the Gregorian and Julian calendars is JANUARY which is 0;
		
		System.out.println("현재 시각 : "+cal.get(Calendar.HOUR_OF_DAY)+"시 "
				+cal.get(Calendar.MINUTE)+"분 " + cal.get(Calendar.SECOND)+"초");
	
	
	
	}

}
