package com.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.entity.LoginEntity;

@WebServlet(name = "Logout", urlPatterns = { "/logout" })
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*  menu.jsp에서 response가 넘어옴 세션 취득해서 세션 있다면 로그아웃  */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		/* 세션이 있다면 entity가 넘어오는데 그게 logOK이름을 가진 세션의 값 = entity, 없다면 null로 초기화 */
		LoginEntity entity = (LoginEntity)session.getAttribute("logOK"); 
		
		if(entity!=null) {
			session.removeAttribute("logOK"); /* 연결을 끊고*/
			response.sendRedirect("/log/index.jsp"); /* response.sendRedirect :  특정 처리 후, 또는 특정 조건일 때에 지정한 페이지로 이동하고 싶은 경우 많이 사용 */
		}
	}

}
