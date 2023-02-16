<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  <!-- "UTF-8"이므로 하나의 페이지에서 여러 언어 사용 가능 -->
<%
	if(request.getParameter("country").equals("korea")){
%>		
			<!-- 웹페이지로 나가는 영역 -->
		감사합니다! <br>	
<%
	}else if(request.getParameter("country").equals("japan")) {
%>	
	ありがとうございます！<br>
<%
	}else if(request.getParameter("country").equals("china")){
		%>	
		谢谢你！<br>
<%
	}
%>	



