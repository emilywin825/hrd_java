package step13_thread;
//단일 쓰레드(Single thread)
public class MyThreadEx1 {
	String str;
	int num;
	public MyThreadEx1() {
		
	}
	public MyThreadEx1(String str,int num) {
		this.str=str;
		this.num=num;
	}
	public void view() {
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
		MyThreadEx1 th1=new MyThreadEx1("one",100);
		MyThreadEx1 th2=new MyThreadEx1("two",100);
		MyThreadEx1 th3=new MyThreadEx1("three",100);
		
		th1.view();
		th2.view();
		th3.view();
	}

}
