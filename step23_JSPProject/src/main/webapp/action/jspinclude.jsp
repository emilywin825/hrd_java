<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@include %>  -->서버쪽에서 인클루드 처리   --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>***** 국가별 감사의 인사 *****</p>
한국어 : 
<jsp:include page="greeting.jsp">
	<jsp:param value="korea" name="country"/>
</jsp:include><!-- 클라이언트 쪽에서 인클루드 처리 -->
일본어 : 
<jsp:include page="greeting.jsp">
	<jsp:param value="japan" name="country"/>
</jsp:include><!-- 클라이언트 쪽에서 인클루드 처리 -->
중국어 : 
<jsp:include page="greeting.jsp">
	<jsp:param value="china" name="country"/>
</jsp:include><!-- 클라이언트 쪽에서 인클루드 처리 -->
</body>
</html>                                        