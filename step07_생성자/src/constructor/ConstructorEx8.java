package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		//자바의 정석, 김자바, 250을 setter로 대입
		//toString()으로 출력
		//자바의정석의 저자는 김자바이고 150페이지로 구성됨
		Book bo=new Book();
		bo.setTitle("자바의 정석");
		bo.setAuthor("김자바");
		bo.setPage(250);
		System.out.println(bo.toString());
		
		//생성자에 jsp무조건따라하기, 이jsp,200을 대입후 getter를 이용하여 출력
		//책이름 : jsp무조건따라하기
		//책저자 : 이jsp
		//페이지 : 200페이지
		
		Book bo2=new Book("jsp무조건따라하기","이jsp",200);
		System.out.println(bo2.getTitle());
		System.out.println(bo2.getAuthor());
		System.out.println(bo2.getPage());
	}

}
