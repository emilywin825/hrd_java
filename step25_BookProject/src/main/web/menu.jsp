<%@page import="dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p{color:red; font-weight:bold; font-size:30px;}
	body{margin:0; padding:0;}
	#menu {height: 100px; background-color: #eee;}
	a{text-decoration:none; display:inline-block; margin-top:40px; font:bold; width:100px; text-align:center;	}
</style>
</head>
<body>
<div id="menu">
	
	<!-- 세션이 존재한다면 로그인한 상태 -->
	<%
		LoginDTO dto=(LoginDTO)session.getAttribute("logOK");
		if(dto==null){ /* 로그인 상태가 아니면 */
	%>  
		<a href="/book/index.jsp">처음화면</a> <!-- context root가 log -->
		<a href="/book/login/login.jsp">로그인화면!</a>
	<%
		} else{ 
	%>	
		<a href="/book/index.jsp">HOME</a>
		<a href="/book/book/bookInput.jsp">도서등록</a>
		<a href="/book/list">도서목록</a>	
		<a href="/book/logout">로그아웃</a>
		<span style="font-size:12px"><b><%= dto.getUserid() %></b>님이 로그인 하셨습니다.</span>
	<%		
		}
	%> 	
</div>
</body>
</html>