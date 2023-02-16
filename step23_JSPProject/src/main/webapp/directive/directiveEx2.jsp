<%@page import="java.util.Random"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%> <!-- language="java" -> 이건 jsp=자바 기반 언어이니까 java로! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=3;
	int b=0;
%>
<h4>**** a와 b의 사칙연산 ****</h4><br><br>
a + b = <%= a+b %><br>
a - b = <%= a-b %><br>
a * b = <%= a*b %><br>
a / b = <%= a/b %><br>
</body>
</html>
