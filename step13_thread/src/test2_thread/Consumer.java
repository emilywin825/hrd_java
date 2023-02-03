package test2_thread;

public class Consumer extends Thread{
	VendingMachine vm=new VendingMachine();
	
	@Override
	public synchronized void run() {
		for(int i=1;i<=10;i++) {	
		System.out.println(currentThread().getName()+ vm.getDrink());
		notify(); //우선순위가 동일안 다른 스레드에게 실행을 양보하고 실행 대기 상태
		}
	}
	
	Consumer(VendingMachine vm){
		this.vm=vm;
	}
}
