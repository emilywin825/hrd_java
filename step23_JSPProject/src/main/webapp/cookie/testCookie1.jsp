<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--cookCookie 페이지에셔 여기로 넘어오면 request 객체 생성-->
<% 
	/* 웹 브라우저가 요청 헤더에 쿠키를 저장해서 보내면 jsp는 request.getCookies()를 이용해 쿠키 값을 읽어올 수 있음 */
	Cookie[] cook=request.getCookies(); /* request.getCookies()는 Cookie 배열을 리턴 */
	if(cook!=null){ /* 읽어올 쿠키가 없으면 */
		for(int i=0;i<cook.length;i++){
%>
		<!-- cookie 클래스가 제공하는 메서드를 사용했음. -->
		Cookie name : <%=cook[i].getName() %><br> 
		Cookie value : <%=cook[i].getValue() %><br><br>
<%
		if(cook[i].getName().equals("logId1")){ // 밑에 코드를 실행할 때 기존 쿠키가 없다면 추가되기 때문에 쿠키의 존재 여부 확인.
			//cook[i].setMaxAge(0); //쿠키 동작시간을 0으로 설정 = 쿠키 제거.
			Cookie cook1=new Cookie("logId1","banana"); //이름이 logId1인 쿠키 객체를 새롭게 생성해서
			response.addCookie(cook1);//응답 데이터에 추가		
		}
		}
	}

%>
<a href="testCookie2.jsp">다음으로 이동</a>

</body>
</html>