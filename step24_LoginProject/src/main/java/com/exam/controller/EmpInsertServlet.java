package com.exam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;


@WebServlet(name = "Insert", urlPatterns = { "/insert" })
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/* empInsert.jsp에서 넘어온 데이터를 EmpEntity 객체 emp를 만들어서 저장하고 biz.insertEmp(emp)를 호출 */
		
		EmpEntity emp = new EmpEntity();	
		emp.setEname(request.getParameter("ename"));
		emp.setPhone(request.getParameter("phone"));
		emp.setDept(request.getParameter("dept"));
		

		EmpBiz biz=new EmpBiz();
		int n=biz.insertEmp(emp);
		
		if(n>0) response.sendRedirect("list");
		else response.sendRedirect("../emptest/empInsert.jsp");
	}

}
