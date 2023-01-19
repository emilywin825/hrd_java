 package object;

import java.util.Scanner;

/*
 * 클래스명 : MemberPhone
 * -name:String
 * -phone:String
 * +input():void <==이름과 전화번호 입력
 * +output():void <== 출력
*/
class MemberPhone{ 
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	} 
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name=sc.nextLine(); //줄단위 입력
		System.out.print("전화를 입력하세요 : ");
		phone=sc.nextLine(); //줄단위 입력
		sc.close();
	}
	public void output() {
		System.out.println(name+" 고객님의 전화번호는 "+phone+"입니다");
	}
}

public class ObjectEx6 {

	public static void main(String[] args) {
		MemberPhone mp=new MemberPhone();
		mp.input();
		mp.output();
	}

}
