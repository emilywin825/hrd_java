<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@page contentType="text/html; charset=UTF-8" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
%>
<h1>Forward Tag Ex1.</h1>
당신의 아이디는 <%=id %>이고
패스워드는 <%=pwd %>입니다.


</body>
</html>