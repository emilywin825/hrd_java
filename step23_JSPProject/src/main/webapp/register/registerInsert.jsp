<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ob" class="register.RegisterEntity" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="ob"></jsp:setProperty>
<%		Connection conn=null;
		DataSource ds=null;
		try{
		/* InitialContext 객체 생성 Context를 상속 받음*/
		Context context=new InitialContext();
		
		//JNDI 서비스 구조의 초기 ROOT 디렉토리 얻기
		//lookup해서 각 WAS 서버의 서비스 루트 디렉토리를 얻음. 톰캣의 루트 디렉토리는 "java:comp/env"
		Context env=(Context)context.lookup("java:comp/env");/* java:comp/env로 접근해서 context.xml에 접근 */
		
		//context.xml에 등록한 네이밍을 lookup
		//톰캣의 context.xml에 등록한 네이밍으로 DataSource를 얻음
		ds=(DataSource)env.lookup("jdb/ora");
		/* ds=(DataSource)env.lookup("java:comp/env"/jdb/ora); 한번에 작성도 가능 */
		
		/* getConnection 메서드로 커넥션 푸레서 커넥션 꺼내오기 */
		conn=ds.getConnection(); 
		conn.setAutoCommit(false);
		}catch(SQLException e){}

		//java:comp/env
		//설정된 엔트리와 자원(Resource)은 JNDI namespacev java:comp/env 부분에 놓이게 되고 
		//자원에 대해 접근하려면 lookup("java:comp/env")을 통해 로컬리소스에 접근  
		
		/* try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","edu","1234");
			conn.setAutoCommit(false);
			System.out.println("연결 성공~");
		}catch (ClassNotFoundException e) {
		} */
		
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
			e1.printStackTrace();
		} }finally{
			try {
				if(pstmt!=null)		pstmt.close(); conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
%>
		

