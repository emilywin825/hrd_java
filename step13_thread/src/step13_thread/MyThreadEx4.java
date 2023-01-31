package step13_thread;

/*대몬 쓰레드 daemon thread -> 주 스레드의 작업을 돕는 보조적인 스레드
 * 일반쓰레드가 종료되면 대몬 쓰레드를 강제로 종료 -> 일반쓰레드가 종료되면 대몬 쓰레드의 존재의미 x
 * ex. hwp의 자동 저장, 화면자동 갱신 
 */
class DaemonTest extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(300);
				System.out.println("hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class MyThreadEx4 {

	public static void main(String[] args) {
		DaemonTest th=new DaemonTest();
		th.setDaemon(true); //true로 지정하면 th객체를 대몬스레드로 지정
		th.run();
		
		int n=0;
		while(n<10) {
			n++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
