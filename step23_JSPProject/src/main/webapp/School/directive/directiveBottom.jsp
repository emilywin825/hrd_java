<%@page import="java.util.Date"%>
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
	Date date=new Date();
%>
나는 include 지시자의 Bottom 부분<br>
<%= date.toLocaleString()  %>	
</body>
</html>