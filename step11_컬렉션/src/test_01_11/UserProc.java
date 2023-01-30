package test_01_11;

import java.util.ArrayList;
import java.util.List;

public class UserProc {
	User entity = null;
	
	public User getLoginUser(String id, String pw) {
		if(id.equals("pororo")&& pw.equals("1234")) {
			entity=new User(); //이 entity와 UserMain의 
			                   //User entity=up.getLoginUser(id, pw);가 같은
			                   //기억공간을 가리킴 따라서 하나가 바뀌면 다른 하나도 바뀜
			entity.setName("뽀로로");
			entity.setPoint(89.97);
			return entity;
		} else return null;
 
		}

	/*
	 * getLoginUser()를 완성하세요
	 * 
	 * 매개변수로 들어온 id와 pw를 pororo와 1234와 비교하여 
	 * 맞으면 entity 객체를 만들어 --> entitiy의 자료형 User
	 * setter를 통해 id, pw, "뽀로로", 89.97
	 * 
	 */
}

