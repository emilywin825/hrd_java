package object;
/*
 * +name:String
 * +k:int
 * +e:int
 * +m:int
 * 
 * +setUser(n:String. k:int, e:int, m:int):void
 * +getTotal():int
 * +getUser():String 
 * */

public class User {
	public String name;
	public int k;
	public int e;
	public int m;

	public void setUser(String name, int k, int e, int m) {
		this.name=name; //this.name->멤버변수 name; name->매개변수로 받은 name
		this.k=k;
		this.e=e;
		this.m=m;
	}
 
	public int getTotal() {
		return k+e+m;
	}

	public String getUser() {
		return "이름은 "+name+"이고 총점은 "+getTotal()+"점 입니다";
	}
}
