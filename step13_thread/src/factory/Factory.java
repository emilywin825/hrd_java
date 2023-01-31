package factory;

public class Factory {
	private int product=0;
	
	public synchronized void produce() { //생산
		if(product>4){
			System.out.println("생산 중단 : "+product);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //스레드 중지
		}
		product++;
		System.out.println("생산 : "+product);
		notifyAll();
	}
	
	public synchronized void sell(){ //소비
		if(product<1){
			System.out.println("소비 중단 : "+product);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //스레드 중지
		}
		product--;
		System.out.println("소비 : "+product);
		notifyAll();
	}

}
