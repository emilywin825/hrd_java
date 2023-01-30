package collection1;
//컬렉션:값을 저장하고 관리하기 위한 객체들
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 중복허용 x, 순서유지 x
//입력한 값들 중에서 고유한 값 하나만 저장하는 특성을 가지는 Collection

public class SetEx {
	
	@SuppressWarnings(value="unchecked")
	
	public static void main(String[] args) {
		Set set = new HashSet(); 
		set.add("one");
		set.add(2); //2-->객체자료형으로 변환해서 저장
		//== Integer.valueof(2)
		set.add(Integer.valueOf(2)); 
		set.add(new Integer(4)); //deprecated ->코드 사용하다 보니 문제가 발생해서 다음 버전부터는 안쓰겠다고 선언 사용은 가능 쓰지 말라고 권고하는 것
		set.add(new Float(3)); //실수 값으로 3저장
		set.add(4.00); //double-->Double.valueOf(4.00) (boxing)
		set.add(new Integer(2)); //위에서도 2저장 했지만 set이기 때문에 하나만 저장됨
		
		System.out.println(set);
		
		Iterator iter=set.iterator(); //객체 생성 //찾아가보니까 개체를 생성후 return하는 코드가 있음
		//set의 값을 가지는 Iterator 데이터 타입의 인스턴스 iter
		while(iter.hasNext()){ //hasNext() -->다음 값이 있는가?
			System.out.println(iter.next());
		}
		iter.remove();
		
		//System.out.println(iter.next()+"-------"); //에러발생
		
		if(set.contains("one")) //contains() --> 데이터가 있는지 확인하는 메소드
			System.out.println("데이터가 있습니다");
		else 
			System.out.println("데이터가 없어요");
		
		System.out.println("set의 크기 : "+set.size()); //size() --> 길이를 확인할 때 사용 
	}  

}

