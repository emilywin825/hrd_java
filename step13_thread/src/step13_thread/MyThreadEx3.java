package step13_thread;
//다중 쓰레드(Multiple thread)
//3. Runnable 인스턴스를 구현
public class MyThreadEx3 implements Runnable{
	String str;
	int num;
	public MyThreadEx3() {
		
	}
	public MyThreadEx3(String str,int num) {
		this.str=str;
		this.num=num;
	}
	@Override
	public void run() { //지정해주소 싶은 멀티스레드 작업이 있으면 run()에 넣어주면 됨
		for(int i=1;i<=num;i++) {
			System.out.println(str+" "+i);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		//1. Runnable 구현 객체를 생성 후
		MyThreadEx3 th1=new MyThreadEx3("one",100); //start() 실행 전까지는 단순한 객체
		MyThreadEx3 th2=new MyThreadEx3("two",100);
		MyThreadEx3 th3=new MyThreadEx3("three",100); 
		
		//Runnable 구현 객체를 매개값으로 Thread 생성자를 호출 -> 작업 스레드가 생성됨
		Thread t1=new Thread(th1); 
		Thread t2=new Thread(th2);
		Thread t3=new Thread(th3);
		
		t1.start(); 
		t2.start();
		t3.start();
		//출력순서 예측할 수 없음
		/* two 80 three 80 one 80 
		 * three 81 two 81 one 81 */
		//남는 시간에 끼워넣기
		
		/* start()는 쓰레드(VMThread)를 생성하고,
		 * 만들어진 쓰레드가 run()을 실행.
		 * run()은 Runnable객체의 run()을 호출
		 *  
		 */
	}
}
