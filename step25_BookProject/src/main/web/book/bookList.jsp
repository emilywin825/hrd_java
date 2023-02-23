<%@page import="dto.BookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../menu.jsp" %>
<%
	ArrayList<BookDTO> list=(ArrayList<BookDTO>)session.getAttribute("book");
	if(list!=null){
%>
	<table border="1">
	<caption>도서전체확인</caption>
	<tr>
	<td>도서코드</td> <td>책이름</td> <td>저자</td> <td>출판사</td> <td>가격</td>
	</tr>

<%
	for(BookDTO bl : list){
%>
		<tr>
		<td><%=bl.getIsbn() %></td> <td><%=bl.getTitle() %></td> <td><%=bl.getAuthor() %></td> 
		<td><%=bl.getCompany() %></td> <td><%=bl.getPrice() %></td>
		</tr>	
<%		
	}
%>
</table>
<a href="bookInput.jsp">도서등록</a>
<%		
	}
%>


</body>
</html>