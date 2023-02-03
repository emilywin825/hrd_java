package test2_thread;

public class Producer extends Thread {
	VendingMachine vm = new VendingMachine();

	@Override
	public void run() {
		vm.putDrink(currentThread().getName());
	}

	Producer(VendingMachine vm) {
		this.vm = vm;
	}

}
