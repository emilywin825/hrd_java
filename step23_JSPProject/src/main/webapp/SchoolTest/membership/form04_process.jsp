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
	String id=request.getParameter("id");
	int passwd=Integer.parseInt(request.getParameter("passwd"));
	String name=request.getParameter("name");
	String phone1=request.getParameter("phone1");
	String phone2=request.getParameter("phone2");
	String phone3=request.getParameter("phone3");
	String sex=request.getParameter("sex");
	String[] hobby=request.getParameterValues("hobby");
	String comment=request.getParameter("comment");
%>
아이디 : <%=id %>이다.<hr>
비밀번호 : <%=passwd %><hr>
이름 : <%=name %><hr>
연락처 : <%=phone1 %> - <%=phone2 %> - <%=phone3 %><hr>
성별 : <%=sex%><hr>
취미 : 
<%
	for(int i=0;i<hobby.length;i++){
		if(hobby[i]!=null)
			out.print(" "+hobby[i]);
	}
%><hr>
가입인사 : <%=comment%><hr>
</body>
</html>