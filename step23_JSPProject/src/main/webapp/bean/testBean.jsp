<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바 코드
import bean.TestBean;

TestBean ob=new TestBean();
ob.setName("개나리");
out.print("나의 이름은 "+ob.getName()+"입니다"); -->



<!-- 객체 생성 -->
<jsp:useBean id="ob" class="bean.TestBean" scope="page"></jsp:useBean> <!-- id가 변수이름이라고생각하면 됨. 우리가 객체를 만들때 변수 선언하는 그 변수 -->

<!-- 변수를 만들었다고 그냥 쓸 수 있는게 아니라 값을 불러오고 저장해야 쓸 수 있듯이 setProperty,getProperty가 그 역할을 수행 -->
<jsp:setProperty property="name" name="ob" value="개나리"/>

<!-- getProperty로 값을 가져옴 -->
나의 이름은 <jsp:getProperty property="name" name="ob"/><!--java에서 getter와 같은 역할  --> 입니다. <br>

<%
	ob.setName("진달래");
%>
너의 이름은 <%=ob.getName()%>야

</body>
</html>