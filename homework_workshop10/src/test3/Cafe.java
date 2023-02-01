package test3;

public class Cafe {
	private Coffee[] coffeeList=new Coffee[3];
	private int index=0;
	int sum=0;
	
	public Cafe() {

	}
	public void setCoffee(Coffee coffee) {
		coffeeList[index]=coffee;
		sum+=coffeeList[index].getPrice();
		index++;
	}
	public int totalPrice() {
		return sum;
	}
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
}
