//2명의 사람이 있습니다.
//사람은 각각 랜덤 1~20까지의 수를 1턴마다 가집니다.
//턴은 총 100턴이고, 100턴을 모두 돌고 난 후,
//1턴마다 사람이 가진 수를 모두 더했을 때, 누가 더 큰수를 가지고 있는지 스레드를 통해 코드를 짜보세요.

class User1 extends Thread {
	

	@Override
	public synchronized void run() {
		int user1hap = 0;
		
		for (int i = 1; i <= 10; i++) {
			int k=(int)(Math.random() * (20)) + 1;
			System.out.println("user1의 "+i+"번째 값은"+k);
			user1hap+=k; 
			Thread.yield();//스레드를 일시 정지 상태
		}
		
		System.out.println("user1의 합은 : "+user1hap);
	}
}

class User2 extends Thread {
	int user2hap = 0;
	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			int k=(int) (Math.random() * (20)) + 1;
			System.out.println("user2의 "+i+"번째 값은"+k);
			user2hap +=k; 
			Thread.yield();//스레드를 일시 정지 상태
		}
		System.out.println("user2의 합은 : "+user2hap);
	}
}

public class RandomhapThread {

	public static void main(String[] args) {
//		Thread u1=new Thread();
//		u1=new User1();
		User1 u1 =new User1();
		User2 u2 =new User2();
		//Thread th2 = new Thread(); th2=new User2();
		
		u1.start();
		u2.start();
	}

}
