package factory;
/*
 * 스레드 조정 p.608
 * 두개의 스레드가 데이터를 주고 받을 때 발생하는
 * 스레드의 정지, 실행과 관련한 문제를 제어하는 용도로 사용
 * wait(), notifyAll()을 이용
 * 
 * wait() : 스레드에 대한 일시 정지를 통해 대기 상태로 만듬
 * notify() : 스레드를 깨워서 다시 실행 //어떤 스레드가 먼저 깨는지 알 수 없음
 * notifyAll() : 스레드를 깨워서 다시 실행 //모든 스레드를 깨움 // 주로 사용
 */

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory=new Factory();
		Buyer buyer=new Buyer(factory);
		Worker worker=new Worker(factory);
		
		buyer.start();
		worker.start();
	}

}
