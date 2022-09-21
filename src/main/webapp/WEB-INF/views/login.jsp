<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>

function login(){
	
	var id = $("#userid").val();
	var pw = $("#userpw").val();
	
	if(id==""){
		alert("아이디를 입력해주세요.")
	}else if(pw==""){
		alert("비밀번호를 입력해주세요.")
	}else{
		loginbtn.submit();
	}
	
}

</script>


</head>
<body>

<form action="loginbtn" id="loginbtn" method = "POST">
		<table border="1">
			<tr>
				<td>아이디 </td>
				<td>
				<input type="text" id="userid" name="userid" placeholder="아이디를 작성하세요">
				</td>
			</tr>
			<tr>
				<td>
					비밀번호 
				</td>
				<td>
				<input type="password" id="userpw" name="userpw"placeholder="비밀번호를 작성하세요">
				</td>
			</tr>
		</table>
		<button type="button" id="signup" onclick="location.href='/register'">회원가입</button>
		<button type="button" onclick="javascript:login();">로그인</button>
</form>

 </body>
</html>