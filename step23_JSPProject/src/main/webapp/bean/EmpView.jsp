<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%-- <!-- 자바 빈즈 -->
<jsp:useBean id="ob" class="bean.EmpVo"></jsp:useBean>
<jsp:setProperty property="*" name="ob"/> 

이름 : <jsp:getProperty property="name" name="ob"/> 
전화 : <jsp:getProperty property="phone" name="ob"/> 
주소 : <jsp:getProperty property="addr" name="ob"/>  --%>

<%
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String addr=request.getParameter("addr");
%>

이름 : <%=name %><br>
전화 : <%=phone %><br>
주소 : <%=addr %><br>
</body>
</html>

<!-- 
import bean.EmpVo; EmpVo ob=new EmpVo();  15번째 줄
ob.setName(request.getParameter("name");
ob.setName(request.getParameter("phone");
ob.setName(request.getParameter("addr"); 16번째 줄

PrintWriter out=response.getWriter();<==웹으로 내보내기 위해
out.print("이름 : "+ob.getName());
out.print("전화 : "+ob.getphone());
out.print("주소 : "+ob.getAddr());//18~20번째 줄
-->