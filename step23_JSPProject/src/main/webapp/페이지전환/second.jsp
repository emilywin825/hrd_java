<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>3초 후에 페이지가 이동합니다.</h4>

<%
	response.setHeader("refresh", "3;url=third.jsp"); /* 3초 후에 third.jsp 파일로 이동 */
	
%>


</body>
</html>