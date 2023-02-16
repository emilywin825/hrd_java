<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //자바코드 영역 -> 웹페이지에서 보이지 않음.
	String str="hello";
%>

<!-- html 주석 부분. '소스 페이지 보기'에서는 보임-->

<%-- jsp 주석. jsp파일에서만 보이고 '소스보기'에서는 나타나지 않음. 브라우저 쪽으로 내보내지 않는 문장 --%>

<!-- <%= str %> 주석 안에서 보이는 변수 -->
<%= str /* 표현식 안에서의 주석 */ %>
</body>
</html>