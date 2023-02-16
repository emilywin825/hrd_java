package com.in.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 : 자바 기반 웹 애플리케이션 프로그래밍 기술
//        클라이언트 요청에 동적으로 작동, 응답은 HTML 형식으로 제공(무조건은 아님)


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
