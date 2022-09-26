<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 제이쿼리 쓸때 필요한 것  -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>

function idcheck(){
	//alert("중복체크!")
	var id = $("#userid").val();
	
	var no = "^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$";
	
	if(id==""){
		alert("사용하실 아이디를 입력해주세요.")
	}else{
	$.ajax({
		url : "idcheck",
		type : "POST",
		data : {
			id : id
		},
		datatype : "json",
		success : function(idcheck){
			
			console.log(idcheck)
			if(idcheck==1){
			$("input[name=inputcheck]").attr("value",idcheck)
			alert("이미 사용중인 아이디입니다!")
			}else if(idcheck==0){
			$("input[name=inputcheck]").attr("value",idcheck)
			alert("사용하실 수 있는 아이디입니다!")
			}
		}, error : function(){
			alert("에러!!")
		}
	})
	}
}

function register(){
	
	var id = $("#userid").val();
	var pw = $("#userpw").val();
	var pw2 = $("#userpw2").val();
	var username = $("#username").val();
	var input = $("#inputcheck").val();
	
	if(id==""){
		alert("아이디를 입력해주세요.")
	}else if(pw==""){
		alert("비밀번호를 입력해주세요.")
	}else if(pw2==""){
		alert("비밀번호를 다시 입력해주세요.")
	}else if(pw!=pw2){
		alert("비밀번호가 서로 맞지 않습니다.")	
	}else if(username==""){
		alert("이름을 입력해주세요.")
	}else if(input=="1"){
		alert("아이디가 중복되었습니다.")
	}else {
		registerbtn.submit();
	}

}
/* function register1(){
	
	var id = $("#userid").val();
	var pw = $("#userpw").val();
	var pw2 = $("#userpw2").val();
	var username = $("#username").val();
	var registercheck = $("#loginStatus").val();
	
	$("input[name=id]").attr('value',id);
	$("input[name=pw]").attr('value',pw);
	$("input[name=pw2]").attr('value',pw2);
	$("input[name=username]").attr('value',username);
	
	if(id==""){
		alert("아이디를 입력해주세요.")
	}else if(pw==""){
		alert("비밀번호를 입력해주세요.")
	}else if(pw2==""){
		alert("비밀번호를 다시 입력해주세요.")
	}else if(pw!=pw2){
		alert("비밀번호와 비밀번호2가 다릅니다.")
	}else if(username==""){
		alert("이름을 입력해주세요.")
	}else if(registercheck=="1"){
		alert("아이디를 다시 확인해주세요.")
	}else{
		hiddenregister.submit();
	}
	
} */

</script>

</head>
<body>
<h1>회원가입 페이지 입니다.</h1>
<form action="/registerbtn" id="registerbtn" method ="POST">
<table>
	<tr>
		<td>
			아이디 : 
		</td>
		<td>
			<input type="text" id="userid" name="userid" placeholder="아이디를 입력하세요">
		</td>
		<td>
			<button type="button" onclick="javascript:idcheck()">중복체크</button>
		</td>
	</tr>
	<tr>
		<td>
			비밀번호 : 
		</td>
		<td>
			<input type="password" id="userpw" name="userpw" placeholder="비밀번호를 입력하세요">
		
		</td>
	</tr>
	<tr>
		<td>
			비밀번호 재입력 : 
		</td>
		<td>
			<input type="password" id="userpw2" name="userpw2" placeholder="비밀번호를 다시 입력하세요">
			
		</td>
	</tr>
	<tr>
		<td>
			이름 : 
		</td>
		<td>
			<input type="text" id="username" name="username" placeholder="이름를 입력하세요">
		</td>
	</tr>
	<tr>
		<td>
			<button type="button" onclick ="javascript:register();">회원가입</button>
		</td>
	</tr>
</table>
</form>
<input type="hidden" id="inputcheck" name='inputcheck' value=''></input>

<!-- <button type="button" onclick ="javascript:register1();">오오오</button>
 
<from id="hiddenregister" action="/registerbtn" method="POST">
<input type="hidden" id="id" name="id" value="">
<input type="hidden" id="pw" name="pw" value="">
<input type="hidden" id="pw2" name="pw2" value="">
<input type="hidden" id="name" name="name" value="">
</from>
 -->
</body>
</html>