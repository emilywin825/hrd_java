package test2_thread;

import java.util.Stack;

public class VendingMachine {
	Stack<Integer> store = new Stack();

	public String getDrink() {
		int i=store.pop();
		return " : 음료수 No. " +i+ " 꺼내먹음";
	}

	public synchronized void putDrink(String drink) {
		for (int i = 1; i <= 10; i++) {
			store.push(i);
			System.out.println(drink + " : 음료수 No. " + i + " 자판기에 넣기 ");
			try {
				wait(); // 스레드 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * wait()와 notify()를 이용하여 완성
	 * 
	 * 
	 * pop() : 꺼냄 push(): 넣기
	 */
}
