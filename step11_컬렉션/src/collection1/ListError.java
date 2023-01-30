package collection1;

import java.util.ArrayList;
import java.util.List;

//자료형의 변환 문제
public class ListError {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10)); //Exception in thread "main" java.lang.ClassCastException 오류 발생
		list.add("겨울");
		
		for(int i=0;i<list.size();i++) {
			String season=(String)list.get(i);
			System.out.println(season); 
		}
	}

}
