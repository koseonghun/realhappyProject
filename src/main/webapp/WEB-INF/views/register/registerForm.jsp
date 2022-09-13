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
	//alert("중복체크")
	
	var id = $("#userid").val();
	
	$.ajax({
		url : "idcheck",
		type : "POST",
		data : {
			id : id
		},
		datatype : "json",
		success : function(result){
			alert("성공!!")
		}, error : function(){
			alert("실패!!")
		}
	})
	
}


/* function idcheck(){
	//alert("중복체크")
	var id = $("#userid").val();
	
	//get 방식할때 url 가공해서 보내주는 형식
	var url = "idcheck?id="+id;
	// 파라미터 값이 2개일때
	var url2 = "idcheck?id="+id+"&pw="+pw;
		
	$.ajax({
		url : url,
		type : "GET", //get = url 에 파라미터 붙여서 보내주고 post = 데이터 숨겨서
		datatype : "json",
		success : function(result){
			console.log(result)
			alert("성공")
		} , error : function(){
			alert("실패")
		}
	})
} */ 

//POST형식
/* function namecheck(){
	//	alert("이름이무엇일까?")
	var name = $("#username").val();
	
	$.ajax({
		url : "namecheck",
		type : "POST",
		data : {
			name : name
		},
		datatype : "json",
		success : function(name){
			console.log(name)
			alert("성공")
		}, error : function(){
			alert("실패")
		}
	})
	
} */

function namecheck(){
	//	alert("이름이무엇일까?")
	var name = $("#username").val();
	var url = "namecheck?name="+name;
	
	$.ajax({
		url : url,
		type : "GET",
		datatype : "json",
		success : function(name){
			console.log(name)
			alert("성공")
		}, error : function(){
			alert("실패")
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
		<td>
			<button type="button" onclick="javascript:namecheck()">이름체크</button>
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