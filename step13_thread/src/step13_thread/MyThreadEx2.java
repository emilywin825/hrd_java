package step13_thread;
//다중 쓰레드(Multiple thread) 
//1. Thread 클래스 상속받음
public class MyThreadEx2 extends Thread{
	String str;
	int num;
	public MyThreadEx2() {
		
	}
	public MyThreadEx2(String str,int num) {
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
		MyThreadEx2 th1=new MyThreadEx2("one",100); //start() 실행 전까지는 단순한 객체
		MyThreadEx2 th2=new MyThreadEx2("two",100);
		MyThreadEx2 th3=new MyThreadEx2("three",100); 
		
		th1.start(); 
		th2.start();
		th3.start();
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
