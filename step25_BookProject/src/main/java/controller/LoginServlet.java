package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import biz.LoginBiz;
import dto.LoginDTO;

@WebServlet(name = "LOGIN", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		
		LoginBiz biz=new LoginBiz();
		boolean b=biz.getLogUser(userid, userpwd);
		
		LoginDTO dto=new LoginDTO(userid,userpwd);
		
		if(b==true) {
			HttpSession session=request.getSession();
			session.setAttribute("logOK", dto);
			response.sendRedirect("/book/login/loginOk.jsp");
		}else {
			response.sendRedirect("/book/login/loginFAIL.jsp");
		}
	}

}
