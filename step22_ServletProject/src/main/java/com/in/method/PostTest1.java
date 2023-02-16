package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "post1.do", urlPatterns = { "/post1.do"}) //urlPatterns는 꼭 적어줘야함
public class PostTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리(utf-8)
		response.setContentType("text/html;charset=utf-8");//클라이언트에 보내줄 데이터(웹 페이지에 나갈 데이터)의 형식 처리//받는 쪽이 UTF-8이니까 맞춰줘야 안깨짐
		/* request 객체가 넘어옴(인코딩 안되어 있음). 그거에 대한 처리 
		 * 클라이언트로부터 전송받은 데이터의 한글처리 -> post 방식은 이 과정이 한번 더 필요
		 * 이유 : get 방식은 데이터 보낼 때 인코딩 해서 보냄 근데 post방식은 데이터 객체를 한번에 보내고 ...?? */
		request.setCharacterEncoding("utf-8");// 읽어온 데이터에 대한 형식 처리. 보낸쪽도 UTF-8이니까(<meta charset="UTF-8">) 맞춰줘야 안깨짐
		
		//2. 데이터 가져오기
		String name=request.getParameter("irum");
		String pwd=request.getParameter("amho");
		
		PrintWriter out=response.getWriter();
		//3. 출력
		out.print(
				"<html><head><title>postTest1</title></head>"); //html 태그로 나감
		out.print("<body>");
		out.print("<h3>Post Test1</h3>");
		out.print("이름 : "+name+"</br>");
		out.print("암호 : "+pwd+"</br>");
		out.print("<a href='/step22_ServletProject/test/postTest1.html'>처음화면</a>");
	}

}
