package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.BookBiz;
import dto.BookDTO;

/*model에 연결시켜줘야지*/
@WebServlet(name = "Input", urlPatterns = { "/input" })
public class InputBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		BookDTO dto=new BookDTO();
		dto.setIsbn(request.getParameter("isbn"));
		dto.setTitle(request.getParameter("title"));
		dto.setAuthor(request.getParameter("author"));
		dto.setCompany(request.getParameter("company"));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));
		
		BookBiz biz=new BookBiz();
		boolean b=biz.bookInsert(dto);
		
		if(b==true) {
			response.sendRedirect("/book/list");
		}else {
			response.sendRedirect("/book/book/bookInput.jsp");
		}
	}

}
