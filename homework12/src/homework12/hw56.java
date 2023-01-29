package homework12;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class PhoneBook{
	private String phone;
	private String address;
	public PhoneBook(){ };
	public PhoneBook(String phone, String address) {
		this.phone = phone;
		this.address = address;
	}
	public String toString() {
		return "연락처 : "+phone+"\n주소 : "+address;
	}
}

public class hw56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,PhoneBook> ht = new Hashtable<>();
		ht.put("홍길동", new PhoneBook("123-4567","서울"));
		ht.put("이몽룡", new PhoneBook("345-3345","대구"));
		ht.put("임꺽정", new PhoneBook("123-7890","부산"));
		
		System.out.print("찾는 사람을 입력하시오 : ");
		String name=sc.next(); sc.close();
		
		if(ht.containsKey(name)) {
			System.out.println(ht.get(name).toString() ); 
		}else System.out.println("찾는 사람이 없습니다.");
	}
}
