package test2;

public class Months {
	public int getDatys(int months) {
		if(months==4||months==6||months==9||months==11) {
			return 30;
		}else if(months==1||months==3||months==5||months==7
						||months==8||months==10||months==12) {
			return 31;
		}else return 0;
	}
}
