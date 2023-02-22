package com.exam.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;

@WebServlet(name = "List", urlPatterns = { "/list" })
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/* 29~29 : 서버 내부적으로 처리 */
	//1. 웹 브라우저의 요청을 받음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset-utf-8");
		
		EmpBiz biz=new EmpBiz();
		ArrayList<EmpEntity> list = biz.listEmp();
		
		/* 새로운 페이지 쪽에서 뿌려줌 */
		if(list!=null) {
			//System.out.println("ok list");
			request.setAttribute("emp", list); /* 리퀘스트명 emp */ /* 4. request를 사용해 처리 결과를 저장 */
			
			//RequestDispatcher 참고 : https://u-it.tistory.com/entry/%ED%8E%98%EC%9D%B4%EC%A7%80%EC%B6%9C%EB%A0%A5-%ED%8E%98%EC%9D%B4%EC%A7%80%EC%A0%84%ED%99%98-%EB%B0%8F-%ED%8A%B9%EC%A0%95-url%EB%A1%9C-%EC%9E%AC-%EC%9A%94%EC%B2%AD-%EC%9D%84-%ED%95%B4%EC%A3%BC%EB%8A%94-RequestDispatcher-%EC%9D%98-requestgetRequestDispatcherforward-HttpServletResponse%EC%9D%98-responsesendRedirect
			//RequestDispatcher를 이용해 알맞은 뷰로 포워딩			
			RequestDispatcher rd = request.getRequestDispatcher("emptest/empList.jsp");
			rd.forward(request, response);//empList.jsp에 권한 위임 //forward() : 페이지 출력, 페이지 전환
		}
	}
}
