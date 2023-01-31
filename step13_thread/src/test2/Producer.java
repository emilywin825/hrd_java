package test2;

public class Producer extends Thread {
	String drink;
	VendingMachine vm = new VendingMachine();

	public Producer(VendingMachine vm) {
		this.vm = vm;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			drink="No."+i;
			vm.putDrink(drink);
			System.out.println(currentThread().getName()+" : 음료수 "+drink+"자판기에 넣기");
		}
	}
}
