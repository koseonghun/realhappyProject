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
	
	$.ajax({
		url : "idcheck",
		type : "POST",
		data : {
			id : id
		},
		datatype : "json",
		success : function(result){
			console.log(result)
			if(result==0){
			alert("이미 사용중인 아이디입니다.")
			}else if(result==1){
			alert("사용하실수있는 아이디입니다.")
			}
		}, error : function(){
			alert("에러!!")
		}
	})
}

</script>

</head>
<body>
<h1>회원가입 페이지 입니다.</h1>

<form action="/registerbtn">
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
			<input type="password" name="userpw" placeholder="비밀번호를 입력하세요">
		</td>
	</tr>
	<tr>
		<td>
			비밀번호 재입력 : 
		</td>
		<td>
			<input type="password" name="userpw2" placeholder="비밀번호를 다시 입력하세요">
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
			<button type="submit">회원가입</button>
		</td>
	</tr>
</table>
</form>
</body>
</html>