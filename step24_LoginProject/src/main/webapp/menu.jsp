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
		LoginEntity entity=(LoginEntity)session.getAttribute("logOK"); //세션에 값 조회하기. 세션이 살아있다면 로그인 상태 = LoginServlet.java 파일에서 session.setAttribute("logOK", entity);이 등록되어 있다는 것
		if(entity==null){ /* 로그인 상태가 아니면 */
	%>
		<a href="/log/logtest/login.jsp">로그인화면</a> <!-- 이 화면을 띄어줌 -->
	<%
		} else{/* 로그인해서 세션이 생기면 */
	%>	<a href="../list">사원전체보기</a>
		<!-- /log/list -->
		<a href="../emptest/empInsert.jsp">사원추가하기</a>	
		<a href="../logout">로그아웃</a>
		<span style="font-size:12px"><b><%=entity.getName() %></b>님이 로그인 하셨습니다. 
		&nbsp;&nbsp;현재 소유하신 포인트는 <b><%=entity.getPoint() %></b>점 입니다.</span>
	<%		
		}
	%>
	<!-- 테스트님이 로그인 하셨습니다. 현재소유하신 포인드는 65.78점입니다. -->		
</div>