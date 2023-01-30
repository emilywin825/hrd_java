package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx5_01_11 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("둘리","객실4");
		map.put("또치","객실1");
		map.put("마이콜","객실3");
		map.put("도우너","객실2");
		map.put("고길동","객실5");		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("방 이름을입력하세요(객실1~객실5) : ");
		String room=sc.next();
		
		Set<String> col=map.keySet();
//		for(String key:col) {
//			String rooom=map.get(key);
//			if(rooom.equals(room)) {
//				System.out.println(room+"에 있는 사용자는 "+key+"입니다.");
//			}
//		}
		
		Iterator<String> iter=col.iterator(); 
		while(iter.hasNext()) {
			String key=iter.next();
			String rooom=map.get(key);
			if(rooom.equals(room))
				System.out.println(room+"에 있는 사용자는 "+key+"입니다.");
		}
		
	}

}
