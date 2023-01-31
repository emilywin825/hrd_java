package step13_thread;

/* 실행 순서의 동기화 처리
 * : 실행 순서를 정의하고 그 순서를 반드시 따라야함
 * 
 * ex)A쓰레드의 처리가 완료된 후 B쓰레드가 처리 되도록 하는 경우
 */

class FamilyThread extends Thread{
	private Washroom wr;//객체
	private String who;
	public FamilyThread(Washroom wr, String who) {
		super();
		this.wr = wr;
		this.who = who;
	}
	@Override
	public void run() {
		try {
			wr.openDoor(who);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Washroom{
	public synchronized void openDoor(String who) throws InterruptedException { //throws InterruptedException -> 호출한 곳으로 return
		System.out.println(who+"님이 입장");
		for(int i=0;i<50000;i++) {
			if(i%10000==0) {
				Thread.sleep(2000);
				System.out.println(who+"님이 볼일 보는 중.....");
			}
		}
		System.out.println(who+"님이 퇴장");
	}
}

public class SyncThreadTest {
	public static void main(String[] args) {
		Washroom wr=new Washroom();
		FamilyThread father=new FamilyThread(wr,"father");
		FamilyThread mother=new FamilyThread(wr,"mother");
		FamilyThread brother=new FamilyThread(wr,"brother");
		FamilyThread sister=new FamilyThread(wr,"sister");
		FamilyThread me=new FamilyThread(wr,"me");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
