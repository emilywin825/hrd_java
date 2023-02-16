<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%><!--error가 나서 일로 넘어온다면 처리하겠다.  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음과 같은 에러가 발생하였습니다.<br>
<%= exception.getMessage() %>
</body>
</html>