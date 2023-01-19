package array;

//1차원 배열
public class ArrayEx2 {

	public static void main(String[] args) {
		String[] car = { "소나타", "코란도", "스파크", "모닝", "아반떼" };
		car[3]="티코";

//		for (int i = 0; i < car.length; i++) {
//			System.out.println(car[i]);
//		}
		
		for(int i=car.length-1;i>=0;i--) {
			System.out.println(car[i]);
		}
		
		for(String i:car) {
			System.out.println(i);
		}
	}

}
