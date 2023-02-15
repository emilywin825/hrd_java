package com.in.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 : html 코드에서 자바코드가 돌아가길 원하는 것
@WebServlet(name = "hello.do", urlPatterns = { "/hello.do" })
public class HelloWervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); //charset=utf-8를 사용할 수 있도록 하는 함수가 setContentType
		
		response.getWriter().print(
				"<html><head><title>처음으로 만들어 보는 서블릿</title></head>"); //html 태그로 나감
		response.getWriter().print("<body>");
		response.getWriter().print("넥스트 서블릿<br>");
		response.getWriter().print("<a href='next.do'>다음으로!");//""안에 ""쓰려면 ''로 써야함
		response.getWriter().print("</body></html>");
		
	}
}
