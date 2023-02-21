package com.exam.biz;

import com.exam.dao.LoginDao;
import com.exam.entity.LoginEntity;

//유효성 검사, 계산처리
public class LoginBiz {
	
	public LoginEntity getLoginUser(String id, String pwd) {
		LoginDao dao=new LoginDao();
		LoginEntity entity=dao.getLoginUser(id,pwd);
		if(entity==null) System.out.println("entity null");
		return entity;
	}
}
