package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "post2.do", urlPatterns = { "/post2.do" })
public class PostTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글 처리
		request.setCharacterEncoding("UTF-8");//읽어온 데이터 처리
		response.setContentType("text/html;charset=utf-8");//화면에 보여질 데이터 처리.	
		
		//2. 데이터 가져오기, 계산
		String name=request.getParameter("name"); //request 객체에 담겨온 name의 파라미터를 뽑아내는게 getParameter
		int score=Integer.parseInt(request.getParameter("score"));
		
		String result=null;
		if(score>=60) result="합격";
		else result="불합격";
		
		//3. 출력
		PrintWriter out=response.getWriter();
		out.print("<html><head></head><body>");
		out.print("이름 : "+name+"<br>");
		out.print("점수 : "+score+"<br>");
		out.print("결과 : "+result+"<br>");
		out.print("<a href='/step22_ServletProject/test/postTest2.html'>처음으로</a>");
		out.print("</body></html>");
	}

}
