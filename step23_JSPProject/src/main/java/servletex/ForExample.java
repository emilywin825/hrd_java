package servletex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForExample")
public class ForExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i<10) { out.print(i+"+"); }
			else {out.print(i+"=");}
			sum+=i;
		}
		out.print(sum);
	}
}
