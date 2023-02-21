package product0221;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Save", urlPatterns = { "/save" })
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//request.setCharacterEncoding("utf-8"); 한글 사용 안해서 별 의미 없음
	
		String item=request.getParameter("item");//item에 해당하는 value를 가져옴
		
		//세션 객체 획득
		HttpSession session= request.getSession();
		
		//shop으로 지정된 객체가 있으면 반환 없으면 null 리턴
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("shop"); /* shop : 이름 임의 지정함 */
		if(list==null) {
			list=new ArrayList<String>();
			list.add(item);
			session.setAttribute("shop", list);			
		}else {
			list.add(item);
		}
		//-------------------------------------------------------------
		PrintWriter out=response.getWriter();
		out.print("<html><head></head><body>");
		out.print("Product Added..<br>");
		out.print("<a href='basket'>MyCart..</a>");
		out.print("</body></html>");
		out.close();
	}

}
