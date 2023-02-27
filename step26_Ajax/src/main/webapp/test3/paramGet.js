function startMethod(){
	var xhr=new XMLHttpRequest();
	var url="result.jsp?"+getParamValue();
	
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
			document.getElementById("display").innerHTML=xhr.responseText;
		}
		
	}
	xhr.open("GET", url, true);/* hellp.jsp에 넘기기 위해서는 인코딩 해야하기 때문에 encodeURI() */
	xhr.send(null);
}

function getParamValue(){
	var name=encodeURI(document.getElementById("name").value);
	var age=encodeURI(document.getElementById("age").value);
	var phone=encodeURI(document.getElementById("phone").value);
	return "name="+name+"&age="+age+"&phone="+phone; /*key value 구조이므로 & 붙임 https://comic.naver.com/bestChallenge/detail?titleId=770167&no=83*/
}