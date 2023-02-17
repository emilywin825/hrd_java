<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	String id=request.getParameter("id");
	int pw=Integer.parseInt(request.getParameter("passwd"));
%>

<table border="1">
<tr>
	<td>아이디</td><td><%=id %></td>
</tr>
<tr>
	<td>비밀번호</td><td><%=pw%></td>
</tr>
</table>
</body>
</html>