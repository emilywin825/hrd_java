<%@page import="com.exam.entity.EmpEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../menu.jsp" %>

<%
	List<EmpEntity> list=(List<EmpEntity>)request.getAttribute("emp"); //emp 이름으로 된 세션의 정보를 찾음
	if(list!=null){/* 세션의 정보가 있으면 */
%>
	<table border="1" align="center" width="500px">
	<tr>
		<td>사원번호</td>
		<td>사원이름</td>
		<td>전화번호</td>
		<td>부서</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
<%
	for(EmpEntity ob : list){
%>
	
	<tr>
		<td><%=ob.getEno() %></td>
		<td><%=ob.getEname() %></td>
		<td><%=ob.getPhone() %></td>
		<td><%=ob.getDept() %></td>
		<form action="emptest/empUpdate.jsp" method="post">
		<input type="hidden" name="eno" value="<%=ob.getEno() %>">
		<input type="hidden" name="ename" value="<%=ob.getEname() %>">
		<input type="hidden" name="phone" value="<%=ob.getPhone() %>">
		<input type="hidden" name="dept" value="<%=ob.getDept()%>">
		<td><input type="submit" value="수정"></td>
		</form>
		<td><input type="button" value="삭제"></td>
	</tr>
	
<%
	} //end of for
%>	
	
	</table>
<%		
	}
%>
</body>
</html>