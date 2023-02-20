function check(){
	if(regForm.mem_id.value=="")/*==if(document.getElementById("sid").value=="")*/{
		alert("ID를 입력하세요");
		regForm.mem_id.focus();
		return;//더이상 확일할 필요 없으므로 ruturn으로 다시 돌아감
	}
	if(regForm.mem_passwd.value==""){
		alert("Password를 입력하세요");
		regForm.mem_passwd.focus();
		return;
	}
	if(regForm.mem_repasswd.value==""){
		alert("Password를 한번 더 입력하세요");
		regForm.mem_repasswd.focus();
		return;
	}
	if(regForm.mem_name.value==""){
		alert("이름을 입력하세요");
		regForm.mem_name.focus();
		return;
	}
	document.regForm.submit();	
}
