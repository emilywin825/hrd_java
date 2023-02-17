package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Insert", urlPatterns = { "/Insert.do" })
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		
		//2. 데이터 가져오기
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String addr=request.getParameter("addr");
		
		//3. 출력
		out.append("<html><head><title>....</title></head>");
		out.append("<body>");	
		
		out.append("<br><br>");
		out.append("이름 : "+name+"</br>");
		out.append("번호 : "+phone+"</br>");
		out.append("주소 : "+addr+"</br>");
		
		Connection conn=null;
		//4. db에 저장
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
		
		String sql="insert into users values(seq_no.nextval,?,?,?)";
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			int n=pstmt.executeUpdate();
			if(n>0) {
				conn.commit();
				out.append("<br>데이터가 저장되었습니다.");
			}
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				out.append("<br>데이터 저장에 실패");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) { e.printStackTrace(); }
		}
		out.append("<a href='test/dbTest.html'>처음화면</>");
		out.append("</body></html>");
	}
}
