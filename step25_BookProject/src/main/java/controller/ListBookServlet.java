package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.BookBiz;
import dto.BookDTO;

@WebServlet(name = "LIST", urlPatterns = { "/list" })
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookBiz biz=new BookBiz();
		ArrayList<BookDTO> list=biz.getBookList();
		
		if(list!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("book", list);
			response.sendRedirect("/book/book/bookList.jsp");
		}	
	}
}
