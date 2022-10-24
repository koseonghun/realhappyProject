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
		alert("id를 입력해주세요.")
	}else if(pw==""){
		alert("pw를 입력해주세요.")
	}else{
	$.ajax({
		url : "loginbtn",
		type : "POST",
		data : {
			id : id,
			pw : pw
		},
		datatype : "json",
		success : function(login){
			console.log(login)
			 if(login==""){
				$("input[name=logincheck]").attr("value",login)
				alert("아이디 또는 비밀번호를 확인해주세요.")
			}else{
				$("input[name=logincheck]").attr("value",login)
				alert("안녕하세요."+login+"님 반갑습니다.")
				//부모 홈페이지 이동할 곳(로그인 성공시 메인 홈페이지)
				opener.parent.location="/homepage";
				window.close();
			}
		}, error : function(){
			alert("에러!!!")
		}
	})
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
		<button type="button" onclick="javascript:login();">로그인</button>
</form>
		<input type="hidden" id="logincheck" name='logincheck' value=''></input>

 </body>
</html>