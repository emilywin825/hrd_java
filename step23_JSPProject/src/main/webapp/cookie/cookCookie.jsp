<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% /* 쿠키 생성 */
	Cookie cook1=new Cookie("logId1","apple");
	Cookie cook2=new Cookie("logId2","orange");

	/* 응답 데이터에 쿠키등록 */
	response.addCookie(cook1); /* response.addCookie() : response 객체는 웹 브라우저에 쿠키 정보를 전송 */
	response.addCookie(cook2);
%>
	쿠키가 생성되었습니다<br>
	쿠기 확인은 <a href="testCookie1.jsp">여기로</a>
</body>
</html>

<!-- 
	쿠키
	웹사이트를 방문할 경우 사용자의 웹브라우저를 통해
	사용자의 컴퓨터나 다른 기기에 설치되는 소형 정보 파일	
 -->