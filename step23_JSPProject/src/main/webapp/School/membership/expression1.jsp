<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! String[] name={"Java","JSP" ,"Android","Struts"};
	public int namelength(){
		return name.length;
	}
%>
<body>
<hr>Expression Example1
<table border="1" width="200">
<% for(int i=0;i<4;i++){ %>
	<tr>
		<td><%= i %></td>
		<td><%=name[i]%></td>
<%}%>
</table>
표의 길이 : <%=namelength() %>
</body>
</html>