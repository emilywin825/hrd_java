package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1=new Book("java","둘리",300); Book bk2=new Book("jsp","도우너",200); Book bk3=new Book("oracle","마이콜",100);
		
		List<Book> list = new ArrayList<>();
		list.add(bk1);  list.add(bk2); list.add(bk3);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println("책이름 : "+list.get(i).getTitle()+"\t책저자 : "+list.get(i).getAuthor()+"\t페이지 : "+list.get(i).getPage());
//		}
		
		for(Book ob:list) {
			System.out.println("책이름 : "+ob.getTitle()+"\t책저자 : "+ob.getAuthor()+"\t페이지 : "+ob.getPage());
		}
	
		Iterator<Book> iter = list.iterator();
		while(iter.hasNext()){
			Book ob=iter.next(); //저장해주지 않으면 값이 달라짐
			System.out.print(ob.getTitle());
			System.out.print("\t"+ob.getAuthor());
			System.out.print("\t"+ob.getPage());
			System.out.println();
//          비정상 동작 
//			System.out.print(iter.next().getTitle());
//			System.out.print("\t"+iter.next().getAuthor());
//			System.out.print("\t"+iter.next().getPage());
		}
	}
}
