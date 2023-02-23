package biz;

import dao.LoginDAO;

public class LoginBiz {
	public LoginBiz() {
	// TODO Auto-generated constructor stub
	}
	
	public boolean getLogUser(String userid, String userpwd) {
		 LoginDAO dao=new LoginDAO();
		 boolean b=dao.getLoginUser(userid,userpwd);
		 return b;
	}
	
}
