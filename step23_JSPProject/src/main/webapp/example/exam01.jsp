<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp : 웹 프로그래밍 언어들 중의 하나
 		   동적인 페이지를 생성하기 위한 서버측 스크립트 언어
		   jsp 컨테이너를 실행시키기 위해서는 톰켓이 필요
 -->
<!-- 스크립트릿 : 자바코드 작성 영역 -->
<% 
	String val="hello jsp";
%>

<%-- <%= val  %> ->표현식 : 변수값을 가져오는 영역 --%>
JSP 명령어로 작성한 <%= val  %><br><br>

<%--  <%!...%> jsp 선언문 : 멤버변수 및 메소드를 선언하는 영역  --%>
<%! 
	int a=5;
	int b=3;
	public int plusMethod(){
		return a+b;
	}
%>

a + b = <%= plusMethod() %><br><br>

<% 
/* PrintWriter out=response.getWriter(); 필요 없음 -> jsp는 디폴트가 html내부이므로 필요 없음 */
	String[] color= {"red","green","blue"};
%>
	<table border='1' width='200px'>"
<%
	for(int i=0;i<color.length;i++) {
%>
		<tr><td><%= i %></td>
		<td><%= color[i] %></td></tr>
<% 
	} 
%>		
		</table>

</body>
</html>
<!-- 자바코드 안에서 html을 보여줌 -> 디자인 보여주기가 힘듦
//html코드 안에다 우리가 보고 싶은 내용을 코드로 넣어줌
프론트가 html 코드 짜서 주면 우리가 바꿔주면 됨 -> html 코드를 읽을줄은 알아야함 -->