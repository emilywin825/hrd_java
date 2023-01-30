package stringex_01_11;

public class StringBufferEx {

	public static void main(String[] args) {
		String buf="aaa";
		buf+="123";
		buf+="가나다";
		System.out.println(buf);
		
		StringBuffer st=new StringBuffer(); //추가되는 데이터 개수가 많으면 StringBuffer가 더 유리
		
		st.append("bbb");
		st.append("567");
		st.append("마바사");
		System.out.println(st);
		System.out.println("길이 : "+st.length());
		System.out.println("길이 : "+st.capacity());//저장 공간의 용량
		
		st.delete(3,6);//3 ~ (6-1) 삭제
		System.out.println(st);
		
		st.reverse(); //역순으로 변경
		System.out.println(st);
		
		st.trimToSize();//길이에 맞게 용량 조정
		st.append("123");
		st.trimToSize();

		System.out.println("길이 : "+st.length());
		System.out.println("용량 : "+st.capacity());
		
	}
	
}
