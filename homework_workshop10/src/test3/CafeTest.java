package test3;

public class CafeTest {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		cafe.setCoffee(new Coffee("Americano", 4000));
		cafe.setCoffee(new Coffee("Caffelatte", 5000));
		cafe.setCoffee(new Coffee("Macchiato", 6000));
		Coffee[] coffeeList=cafe.getCoffeeList();

		for (int i = 0; i < 3; i++) {
			System.out.println(coffeeList[i].toString());
		}
		System.out.println("Coffee 가격의 합 :" + cafe.totalPrice()+"원");

		// Coffee 객체를 3개 생성하고, setCoffee()이용하여 Coffee 배열에 넣는다.
		// Coffee 배열에 있는 객체 정보를 모두 출력 한다 – for 문을 이용 할 것
		// Coffee 가격의 합을 출력 한다
	}

}
