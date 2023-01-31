package test2;

import java.util.Stack;

public class VendingMachine {
	String drink;
	// private String drink;
	Stack<String> stack = new Stack<>();

	public synchronized String getDrink() {
		if(stack.isEmpty()) {
			notify();
		}try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return stack.pop(); 
		
	}

	public synchronized void putDrink(String drink) {
		stack.push(drink);
		notify();
	}

	/*
	 * wait() : 자기 자신을 일시 정지 상태로 notify() : 일시정지 상태인 다른 스래드를 실행 대기 상태로 를 이용하여 완성
	 * Stack<> store=new Stack<>(); pop() : 꺼냄 push(): 넣기
	 */

}
