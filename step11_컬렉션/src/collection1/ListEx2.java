package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//제네릭스
public class ListEx2 {

	public static void main(String[] args) {
		//String타입만 들어올 수 있음
		List<Object> list=new ArrayList<>(); //Object는 모든 클래스의 슈퍼 클래스 이므로 List<Object> 하면 모든 자료형 들어갈 수 있음
		list.add("봄");
		list.add("여름");
		list.add("가을");
		//list.add(Integer.valueOf(10)); //The method add(String) in the type List<String> is not applicable for the arguments (Integer) 오류
		list.add("겨울");
		 
		for(Object x:list) {
			System.out.println(x);
		}
		
		Iterator<Object> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
