<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getParameter("id").equals("aaaa") && request.getParameter("passwd").equals("aaaa")){
%>
	{"result":"ok"}
<%
	}else{
%>
	{"result":"fail"}
<% 
	}
%>