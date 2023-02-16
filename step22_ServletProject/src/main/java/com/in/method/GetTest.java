package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자가 getTest.html을 이용해 데이터를 입력해 전달하면 이 페이지에서 받아서 처리=서버 
@WebServlet(name = "get.do", urlPatterns = { "/get.do" })
public class GetTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리 (utf-8, euc-kr) charset=utf-8를 사용할 수 있도록 하는 함수가 setContentType
		response.setContentType("text/html; charset=utf-8");
		
		//2. 데이터 가져오기 (get 방식을 이용한 처리)
		String name=request.getParameter("irum"); //항상 변수를 이용해서 사용
		String pwd=request.getParameter("amho");
		
		//3. 결과 출력 - getTest.html 페이지에서 전송 버튼 누르면 넘어간 화면에서 이게 출력됨
		PrintWriter out=response.getWriter(); //클라이언트 측에 데이터를 뿌려주겠다.(웹으로 나감. 콘솔로 나가는거 아님) 함수 이름을 통으로 외우는게 가장 편함
		out.print(
				"<html><head><title>getTest</title></head>"); //html 태그로 나감
		out.print("<body>");
		out.print("<h3>Get Test</h3>");
		out.print("이름 : "+name+"</br>");
		out.print("암호 : "+pwd+"</br>");
		out.print("<a href='/step22_ServletProject/test/getTest.html'>처음화면</a>");
		out.print("</body></html>");	
	}
}
