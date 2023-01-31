package step13_thread;
/*
 * 쓰레드의 우선순위
 * setPriority() 이용하여 우선순위 부여(1~10)
 * 우선 순위가 높은 스레드 : 실행 시간을 많이 할당 받음
 * 다른 쓰레드에 비해 많은 실행 시간을 필요로 한다면 우선 순위를 높게 두면 됨
 * MAX_PRIORITY : 우선 순위 10(최고 순위)
 * MIN_PRIORITY : 우선 순위 1(최저 순위)
 * NORM_PRIORITY : 우선 순위 5(순위 미지정)
 */

public class RoseTest extends Thread {
	private String str;

	public RoseTest(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			try {
				Thread.sleep(5);
				//System.out.println(str + "\t" + Thread.currentThread()); // 현재 실행되고 있는 스레드의 이름,우선순위,그룹을 리턴
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println(getName());
	}

	public static void main(String[] args) {
		RoseTest rt1 = new RoseTest("사랑");
		RoseTest rt2 = new RoseTest("가시");
		RoseTest rt3 = new RoseTest("장미");
		rt1.setName("사랑");
		rt2.setName("가시");
		rt3.setName("장미");
		
		rt1.setPriority(Thread.MAX_PRIORITY);
		rt2.setPriority(Thread.MIN_PRIORITY);
		rt3.setPriority(Thread.NORM_PRIORITY);
	
		rt1.start();
		rt2.start();
		rt3.start();

//		rt1.start();
//		try {
//			rt1.join(); // rt1에 대해서 우선 동작 //rt1 종료 전까지 rt2,rt3은 쉬고 있음
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		rt2.start();
//		rt3.start();
	}
}
