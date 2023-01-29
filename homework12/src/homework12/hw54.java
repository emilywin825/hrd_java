package homework12;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hw54 {
	public static void main(String[] args) {
		DecimalFormat decf=new DecimalFormat("###,###");
		Map<String, Integer> map = new HashMap<>();
		map.<String,Integer>put("콩쥐팥쥐", 15000);
		map.put("백설공주", 10000);
		map.put("보물섬", 18000);
		
		Set<String> set=map.keySet();//키값을 set으로 return
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+"의 책가격="+decf.format(value)+"원");
		}
		
	}
}

