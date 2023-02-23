package biz;

import java.util.ArrayList;

import dao.BookDAO;
import dto.BookDTO;

public class BookBiz {

	public boolean bookInsert(BookDTO dto) {
		BookDAO dao=new BookDAO();
		boolean b=dao.bookInsert(dto);
		return b;
	}
	
	public ArrayList<BookDTO> getBookList(){
		BookDAO dao=new BookDAO();
		ArrayList<BookDTO> list=dao.getBookList();
		return list;
		
	}
	
}
