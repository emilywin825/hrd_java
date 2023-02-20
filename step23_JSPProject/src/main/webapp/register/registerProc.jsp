<%@page import="register.RegisterEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8"); /* 한글 처리 */
%>		
<html>
<head><title>회원가입 확인</title></head>
<jsp:useBean id="ob" class="register.RegisterEntity" scope="session"></jsp:useBean> <!-- scope="session" 사용자가 최초에 접속하여 세션이 종료되기까지 존대 -->
<jsp:setProperty property="*" name="ob"></jsp:setProperty> <!--이 코드를 이용해서 RegisterEntity.java에 저장 -->
<%
	String post1=request.getParameter("mem_zipcode");
	String post7=request.getParameter("mem_detailaddr");
	String post8=request.getParameter("mem_roadaddr");
	ob.setMem_addr(post8+" "+post7);
%>

<body>
<form name="regForm" method="post" action="registerInsert.jsp">
<table width="80%" align="center" border="0" cellspacing="0" cellpadding="5">
	<tr>
		<td align="center" valign="middle" >
		<table width="90%" border="1"bgcolor="#FFFFCC" cellspacing="0" cellpadding="2" align="center">
			<tr align="center" bgcolor="#996600">
				<td colspan="3">
					<font color="#FFFFFF"><b>
					[<%=ob.getMem_name()%>]님이 작성하신 내용입니다. 확인해 주세요</b>
				<%-- [<jsp:getProperty name="ob" property="mem_name">]님이 작성하신 내용입니다. 확인해 주세요</b> --%>
					</font>
				</td>
			</tr>
			<tr>
				<td width="24%">아이디</td>
				<td width="41%"><%=ob.getMem_id() %></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><%=ob.getMem_passwd() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=ob.getMem_name() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=ob.getMem_email() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%=ob.getMem_phone() %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td>(<%=ob.getMem_zipcode()%>) <%= ob.getMem_addr() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit"  value="확인완료"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input	type="reset" value="다시쓰기" onClick="history.back()"></td>
					<!-- history.back(): 이전 페이지로 돌아가기 -->
					<!-- "location.href='register.html'" -->
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>
