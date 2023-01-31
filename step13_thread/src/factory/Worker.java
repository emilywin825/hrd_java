package factory;

public class Worker extends Thread{
	private Factory factory;
	
	public Worker(Factory factory) {
		this.factory=factory;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=500;i++) {
			factory.produce();
		}
	}
}
