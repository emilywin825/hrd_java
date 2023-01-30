package collection3_01_11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		
		Map<String, Double> ht = new Hashtable<>();
		ht.put("둘리", 75.2);
		ht.put("해리포터", 100.0);
		ht.put("마이콜", 85.2);
//		ht.put("두들리", 75.2);
//		ht.put(null, 75.2);
		
		System.out.println("이름\t점수");
		System.out.println("==========================================");
		Set<String> set=ht.keySet();
		for(String ob:set)
			System.out.println(ob+"\t"+ht.get(ob));
	}

}
