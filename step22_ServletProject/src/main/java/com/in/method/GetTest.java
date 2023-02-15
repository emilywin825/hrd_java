package com.in.method;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "get.do", urlPatterns = { "/get.do" })
public class GetTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); //charset=utf-8를 사용할 수 있도록 하는 함수가 setContentType
		
		response.getWriter().print(
				"<html><head><title>getTest</title></head>"); //html 태그로 나감
		response.getWriter().print("<body>");	
		
	}

}
