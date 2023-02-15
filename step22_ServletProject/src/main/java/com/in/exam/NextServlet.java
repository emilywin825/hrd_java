package com.in.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//일반적으로 doGet, doPost를 같이 만들지 않음

@WebServlet(name = "next.do", urlPatterns = { "/next.do" })
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NextServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); //charset=utf-8를 사용할 수 있도록 하는 함수가 setContentType
		
		response.getWriter().print(
				"<html><head><title>처음으로 만들어 보는 서블릿</title></head>"); //html 태그로 나감
		response.getWriter().print("<body>");
		response.getWriter().print("헬로우 서블릿<br>");
		response.getWriter().print("<a href='hello.do'>이전으로!");//""안에 ""쓰려면 ''로 써야함
		response.getWriter().print("</body></html>");
	}

}
