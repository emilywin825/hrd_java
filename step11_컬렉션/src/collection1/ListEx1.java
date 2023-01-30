package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//List : 중복허용 o , 순서유지 o
//배열과 비슷, 담을 수 있는 갓의 수가 자동으로 증가되는 컨테이너(컬렉션즈프레임웍) //배열은 기억공간의 크기가 한번 정해지면 변경할 수 없음 
//서로 다른 자료형의 연속된 기억공간

public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List list=new ArrayList(); 
		list.add("one");
		list.add("second"); 
		list.add("3rd");
		list.add("4"); 
		list.add(Integer.valueOf(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add("5.0f");
		System.out.println(list);
		
		for(int i=list.size();i<1000000;i++) {
			list.add(i);
		}
		
//		
//		for(int i=1;i<list.size();i++) {
//			//size() 리스트에 있는 데이터의 개수를 리턴
//			System.out.println(list.get(i)); 
//			//get(index) 인덱스에 해당하는 값을 리턴
//		}
		System.out.println("--------------------------------");
		list.remove(3); //삭제 직접적인 값을 넣을 수도 있고 인덱스 번호를 넣을 수도 있음
		for(Object x:list) {
			Object x1=x;
		}
		System.out.println();
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());}
		
		double start=System.currentTimeMillis();
		double end=System.currentTimeMillis();					
		//System.out.println("소요시간 : "+(end-start));
		//성능: 일발 for문>이터레이터>향상된 for문

	} 

}
