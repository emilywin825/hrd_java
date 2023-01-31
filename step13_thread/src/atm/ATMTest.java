package atm;

public class ATMTest{

	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread mom=new Thread(bank,"엄마");//bank객체에 대해서 스레드 처리
		Thread son=new Thread(bank,"아들");
		
		mom.start();
		son.start();
	}

}
