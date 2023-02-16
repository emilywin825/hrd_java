<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- forward 태그 : 현재 JSP 페이지에서 다른 페이지로 이동하는 태그 -->
<%
	request.setCharacterEncoding("utf-8");
	String btype=request.getParameter("btype");
	
	if(btype.equals("A")){
	/* forward 태그 : 값이 결정되기 전에 페이지 넘어가면 안됨 */
%>
	<jsp:forward page="A.jsp" />
<%
	}else if(btype.equals("B")){
%>
	<jsp:forward page="B.jsp" />
<%
	}else if(btype.equals("AB")){
%>
	<jsp:forward page="AB.jsp" />
	<%
	}else if(btype.equals("O")){
%>
	<jsp:forward page="O.jsp" />
<%} %>
</body>
</html>