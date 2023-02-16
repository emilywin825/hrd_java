<%@page import="java.util.Random"%>
<%@page import="java.util.Calendar"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="hello"%> <!-- language="java" -> 이건 jsp=자바 기반 언어이니까 java로! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp 지시어
page 지시어 : 컨테이너에서 처리할 때 필요한 속성을 기술
<%-- <%@ page page 속성=값 속성=값 ....%> --%>
include 지시어 : 하나의 jsp 파일에 여러개의 html, jsp 파일을 포함하는 형식
JSP 페이지의 특정 영역에 다른 문서를 포함함
나가는 결과가 하나의 웹페이지로 만들어 져서 나갈때 
 -->
 <%= getServletInfo() %><br>
<%
	Calendar ca=Calendar.getInstance();
	int year=ca.get(Calendar.YEAR);
	int month=ca.get(Calendar.MONTH)+1;
	int day=ca.get(Calendar.DAY_OF_MONTH);
	
	Random rd=new Random();
	int x=rd.nextInt();
%>
오늘 날짜 : <%=year %>년 <%=month %>월 <%=day %>일 <br>
생성한 난수 : <%= x %>
</body>
</html>
<!-- 웹 어플리케이션 서버
=백그라운드에서 프로그램 실행시킴
->이때 사용되는 언어가 jsp,php,asp -->