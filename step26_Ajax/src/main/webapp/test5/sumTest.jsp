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
	double bottom=Double.parseDouble(request.getParameter("bottom"));
	double height=Double.parseDouble(request.getParameter("height"));
	double area=bottom*height*0.5;
%>
*** 삼각형의 넓이 *** <br>
밑변 입력 : <%=bottom %> <br>
높이 입력 : <%=height %> <br>
삼각형의 넓이 : <%=area %>
</body>
</html>