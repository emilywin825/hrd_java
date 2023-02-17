package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "List", urlPatterns = { "/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//4.db에서 조회
		Connection conn=null;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
				conn.setAutoCommit(false);
				System.out.println("연결성공");
			} catch (SQLException e) {
				System.out.println("1111");
			}						
		} catch (ClassNotFoundException e) {
			System.out.println("2222");
		}
		
		String sql="select * from users order by num desc";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		PrintWriter out=response.getWriter();

		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			out.append("<html><head><title>....</title></head>");
			out.append("<body>");	
			out.append("<table border='1' width='350px'>");
			
			while(rs.next()) {
				out.append("<tr>");
				out.append("<td>"+rs.getInt("num")+"</td>");
				out.append("<td>"+rs.getString("name")+"</td>");
				out.append("<td>"+rs.getString("phone")+"</td>");
				out.append("<td>"+rs.getString("addr")+"</td>");
				out.append("</tr>");
			}
			out.append("</table>");
			out.append("<a href='test/dbTest.html'>처음화면</>");
			out.append("</body></html>");
			
		}catch (SQLException e) {
			System.out.println("ListServlet 페이지 에러");
		}
	
	}

}
