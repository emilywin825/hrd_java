function sum(){
	var xhr=new XMLHttpRequest(); //선언
	var url="sumTest.jsp?"+getParamValue();
	
	xhr.onreadystatechange=function(){ //요청에 대한 콜백
	//xhr.readyState==4 : 요청이 완료됨 && xhr.status==200 : HTTP 상태 코드 : HTPP 2XX : 요청을 성공적으로 받았으며 인식했고 수용하였다
		if(xhr.readyState==4 && xhr.status==200){
			document.getElementById("sumResult").innerHTML=xhr.responseText; /*responseText 프로퍼티는 서버에 요청하여 응답으로 받은 데이터를 문자열로 반환*/
		}
	}
	xhr.open("GET", url); //메소드와 보낼 서버 주소 설정
	xhr.send();// 요청 전송
}

function getParamValue(){
	var bottom=encodeURI(document.getElementById("bottom").value);
	var height=encodeURI(document.getElementById("height").value);
	return "bottom="+bottom+"&height="+height; /*key value 구조이므로 & 붙임 https://comic.naver.com/bestChallenge/detail?titleId=770167&no=83*/
}

