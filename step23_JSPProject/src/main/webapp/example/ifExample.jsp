<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%/* void setCharacterEncoding(String env)
	 해당 request에 사용된 인코딩 방식을 env 인코딩으로 재정의함
	 request 객체를 얻어오기 전에 작성해야 함 */
 	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name"); //서버측에서 넘어온 데이터. 서버측이 객체를 넘기면 그 중 name인걸 뽑아냄
	String color=request.getParameter("color");
	String colorName=null;
	
	if(color.equals("skyblue")){
		colorName="하늘색";
	}else if(color.equals("limegreen")){
		colorName="초록색";
	}else if(color.equals("yellow")){
		colorName="노란색";
	}else{
		colorName="없음";
		color="white";//지정 안해주면 검은색 됨
	}
%>
<body bgcolor="<%=color%>">
<%= name %>님이 좋아하는 색상은 <%=colorName%>입니다.
</body>
</html>