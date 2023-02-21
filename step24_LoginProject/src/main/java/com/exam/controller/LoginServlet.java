package com.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.biz.LoginBiz;
import com.exam.entity.LoginEntity;

/*MVC 패턴에서 Controller 역할 : 어떤 함수를 사용할 것인지 결정(?)*/
@WebServlet(name = "Login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		System.out.println(id+" "+pwd);
		
		LoginBiz biz=new LoginBiz();
		LoginEntity entity=biz.getLoginUser(id,pwd);
		//세션 설정
		if(entity!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("logOK", entity); //세션이름 logOK, 이 이름과 연결시킨게 entity 이게 문제 없으면 로그인 성공
			
			response.sendRedirect("/log/logtest/loginOK.jsp");
		}else {
			System.out.println("로그인 실패");
			//response.sendRedirect("log/logtest/loginOK.jsp");
		}
	}

}
