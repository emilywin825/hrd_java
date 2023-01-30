package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(3, "피카츄");
		map.put(1, "잠만보");
		map.put(4, "파이리");
		map.put(2, "꼬부기");
		
		System.out.println(map); //출력될 때 순서대로 나오는 것 처럼 보이는데 그냥 키에 맞춰서 출력해준것임
		
		Set<Integer> keys=map.keySet(); //map의 키만 뽑아줌
		List<Integer> list=new ArrayList<>(keys);
		Collections.sort(list);
		
		for(Integer n:list)
			System.out.println(map.get(n));
		
		System.out.println(keys);
		for(Integer n:keys)
			System.out.println(map.get(n));
		
		
//		System.out.println(map); //출력될 때 순서대로 나오는 것 처럼 보이는데 그냥 키에 맞춰서 출력해준것임
//		Set<Integer> keys=map.keySet(); //map의 키만 뽑아줌
//		//System.out.println(keys);
//		for(Integer n:keys)
//			System.out.println(map.get(n));
	}

}
