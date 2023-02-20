<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ob" class="register.RegisterEntity" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="ob"></jsp:setProperty>
<%
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","edu","1234");
			conn.setAutoCommit(false);
			System.out.println("연결 성공~");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		PreparedStatement pstmt=null;
		String sql="insert into member values(?,?,?,?,?,?,?)";
		
	try{
		pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, ob.getMem_id());
		pstmt.setString(2, ob.getMem_passwd());
		pstmt.setString(3, ob.getMem_name());
		pstmt.setString(4, ob.getMem_email());
		pstmt.setString(5, ob.getMem_phone());
		pstmt.setString(6, ob.getMem_zipcode());
		pstmt.setString(7, ob.getMem_addr());
		int n=pstmt.executeUpdate();
		
		if(n>0){
			conn.commit();
%> 		<b><%= ob.getMem_name()%><b/> 님 회원가입이 완료되었습니다. 		
<% } 
	} catch (SQLException e) {
		try {
			conn.rollback();
			out.append("<br> 데이터 저장에 실패하였습니다");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} }finally{
			try {
				if(pstmt!=null)		pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
%>
		

