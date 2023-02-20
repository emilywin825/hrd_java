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

@WebServlet(name = "Insert", urlPatterns = { "/insert.do" })
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글처리
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter(); //웹에 출력
		
		//2. 데이터 가져오기
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String addr=request.getParameter("addr");
		
		//3. 출력
		out.append(
				"<html><head><title>postTest1</title></head>");
		out.append("<body>");
		
		out.append("<br><br>");
		out.append("이름 : "+name+" ");
		out.append("전화 : "+phone+" ");
		out.append("주소 : "+addr+"<br>");
		
		Connection conn=null;
		//4. db에 저장
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","edu","1234");
			conn.setAutoCommit(false);
			//System.out.println("연결 성공~");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException e) {
			// TODO: handle exception
		}
//		---------------------------------------------------------
		
		PreparedStatement pstmt=null;
		
		String sql="insert into users values(seq_no.nextval, ?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, name);
			pstmt.setString(3, name);
			int n=pstmt.executeUpdate();
			if(n>0) {
				conn.commit();
				out.append("<br> 데이터가 저장되었습니다");
			}
				
		} catch (SQLException e) {
			try {
				conn.rollback();
				out.append("<br> 데이터 저장에 실패하였습니다");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}finally {
			
			try {
				if(pstmt!=null)		pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		out.append("<a href='test/dbTest.html'>처음화면</a>");
	
		out.append("</body></html>");
	}

}
