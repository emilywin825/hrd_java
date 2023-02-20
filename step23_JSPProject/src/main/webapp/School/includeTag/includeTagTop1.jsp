<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
include Action Tag의 Top입니다.<br>
<%
	String name=request.getParameter("name");
%>
<%=name %> Fighting!!!<br>
</body>
</html>