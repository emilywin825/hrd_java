package objectarray;

public class UserEx1 { //자바에서 모든 클래스는 사실 Object를 암시적으로 상속받고 있음
 
	public static void main(String[] args) {
		User ob1=new User("둘리","강남구");
		User ob2=new User("도우너","강동구");
		User ob3=new User("마이콜","강서구");
		System.out.println(ob1.getName()+"\t"+ob1.getAddr());
		System.out.println(ob2.getName()+"\t"+ob2.getAddr());
		System.out.println(ob3.getName()+"\t"+ob3.getAddr());
		
		System.out.println("************************");
		//객체배열
		User[] ua=new User[3];
		ua[0]=new User("둘리","강남구");
		ua[1]=new User("도우너","강동구");
		ua[2]=new User("마이콜","강서구");
		for(int i=0;i<ua.length;i++) {
			System.out.println(ua[i].getName()+"\t"+ua[i].getAddr());
		}
		System.out.println("************************");
		for(User u:ua) {
			System.out.println(u.getName()+"\t"+u.getAddr());
		}
	}

}
