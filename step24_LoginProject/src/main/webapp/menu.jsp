<%@page import="com.exam.entity.LoginEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p{color:limegreen; font-weight:bold; font-size:30px;}
	body{margin:0; padding:0;}
	#menu {height: 100px; background-color: #eee;}
	a{text-decoration:none; display:inline-block; margin-top:40px; font:bold; width:100px; text-align:center;	}
</style>
</head>
<body>

<div id="menu">
	<a href="/log/index.jsp">처음화면</a> <!-- context root가 log -->
	<!-- 세션이 존재한다면 로그인한 상태 -->
	<%
		LoginEntity entity=(LoginEntity)session.getAttribute("logOK");
		if(entity==null){
	%>
		<a href="logtest/login.jsp">로그인화면</a>
	<%
		}
	%>		
</div>