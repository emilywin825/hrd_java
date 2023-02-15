package Test_47;

import java.util.Scanner;

public class SportsCar implements Speed,CurrentSpeed{
	Scanner sc= new Scanner(System.in);
	public int velocity;//입력받을속도
	public int currVelocity;//현재속도
	public SportsCar() {//currVelocity에 초기값으로 SPEED설정
		currVelocity=SPEED;
	}
	public void inVelocity() {//속도를 입력받음
		System.out.print("속도를 입력하시오 : ");
		velocity=sc.nextInt();
	}
	public void outVelocity() {
	  //velocity가 0보다 크면 speedUp()호출
	  //velocity가 0보다 작으면 speedDown()호출
		if(velocity>=0) currVelocity=speedUp(velocity);
		else if(velocity<0) currVelocity=speedDown(velocity);	
	}
	
	@Override
	public void currSpeedCheck() {//현재속도를 출력하는 메서드
	//현재속도가 0 또는 음수값일 경우에는 "정지하셨습니다" 출력하고 프로그램 종료
		if(currVelocity<=0) {
			System.out.println("정지하셨습니다");
			System.exit(0);
		}
		else {
			System.out.println("현재속도는 "+ currVelocity+"km/h 입니다.");
		}
		
	}

	@Override
	public int speedUp(int inc) {//가속메서드
		return currVelocity+inc;
	}

	@Override
	public int speedDown(int dec) {//가속메서드
		return currVelocity+dec;
	}
}
