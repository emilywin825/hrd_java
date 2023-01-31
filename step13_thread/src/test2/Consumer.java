package test2;

public class Consumer extends Thread {
	String drink;
	VendingMachine vm;

	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : 음료수"+vm.getDrink()+"꺼내먹기");
		}
	}
}
