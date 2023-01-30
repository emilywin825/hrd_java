package collection2;

import java.util.HashMap;
import java.util.Map;

//map : 키와 값의 쌍
//      키 벨류 형식의 저장 방식을 가지는 컨테이너
//iterator 기능이 없음
//iterator 반복 기능을 제공
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(101, "둘리"); //put()--> map데이터 추가 함수
		map.put(201, "도우너");
		map.put(301, "마이콜"); 
		map.put(401, "또치"); 
		
		System.out.println("Key : "+101+" value : "+map.get(101)); //get(key) : 벨류를 리턴, 값이 없으면 null을 리턴
		System.out.println("Key : "+201+" value : "+map.get(201));
		System.out.println("Key : "+301+" value : "+map.get(301));
		System.out.println("Key : "+401+" value : "+map.get(401));
		map.remove(401);//remove(key) : 데이터 삭제
		System.out.println(map.get(401));
		
		map.clear(); //map 데이터 전부 삭제
		
	}

}
