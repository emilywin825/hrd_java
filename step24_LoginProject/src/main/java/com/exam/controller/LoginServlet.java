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
	//1. HTTP 요청을 받음
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		//2. 사용자의 요청을 분석
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		//System.out.println(id+" "+pwd);
		
		/* 26-27 : 유효성 검사를 위한 biz */
		//biz를 통해서 유효성 검사를 하고 controller 역할을 하는 LoginDao로 이동
		//3. LoginDao가 비즈니스 로직을 수행하고 수행 결과를 리턴. 이 결과를 entity 객체에 담아서 36번째 줄의 session에 저장
		LoginBiz biz=new LoginBiz(); 
		LoginEntity entity = biz.getLoginUser(id, pwd); 
		
	
		//세션 설정
		if(entity!=null) {
			HttpSession session=request.getSession(); //세션 생성
			//5. 결과를 session에 저장
			session.setAttribute("logOK", entity); //logOK로 세션 이름을 지정하고 logOK 세션에 entity 값을 저장
			
			//현재 동작 파일 경로
			//System.out.println(request.getRequestURI()); 
			
			response.sendRedirect("logtest/loginOK.jsp"); //6. 알맞은 뷰 선택한 후, 뷰로 포워딩
		}else {
			System.out.println("LoginServlet_로그인 실패");
			response.sendRedirect("logtest/loginFail.jsp");
		}
	}
}
