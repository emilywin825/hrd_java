package com.exam.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;

import static common.JdbcTemplate.*;

//컨트롤러
@WebServlet(name = "Update", urlPatterns = { "/update" })
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ename=request.getParameter("ename");
		String phone=request.getParameter("phone");
		String dept=request.getParameter("dept");
		
		EmpBiz biz=new EmpBiz();
		int n=biz.updateEmp(ename,phone,dept);
		
		if(n>0) {
			RequestDispatcher rd = request.getRequestDispatcher("emptest/empList.jsp");
		}
	}

}
