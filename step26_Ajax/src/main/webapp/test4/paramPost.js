function startMethod(){
	var xhr=new XMLHttpRequest();
	var url="result.jsp"; //get 방식과 차이 보기
	
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
			document.getElementById("display").innerHTML=xhr.responseText;
		}
	}
	
	xhr.open("POST", url, true);/* hellp.jsp에 넘기기 위해서는 인코딩 해야하기 때문에 encodeURI() */
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
	xhr.send(getParamValue());
}

function getParamValue(){
	var name=encodeURI(document.getElementById("name").value);
	var age=encodeURI(document.getElementById("age").value);
	var phone=encodeURI(document.getElementById("phone").value);
	return "name="+name+"&age="+age+"&phone="+phone; /*이 방법이 쿼리 스트링*/
	/*key value 구조이므로 & 붙임 https://comic.naver.com/bestChallenge/detail?titleId=770167&no=83*/
}