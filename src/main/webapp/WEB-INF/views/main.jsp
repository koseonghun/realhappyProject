<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- <script>
var i = 0;
var test = "안녕";
console.log(test);
console.log(i);

function ko(){
	i++;
	console.log(i)
}

</script> -->
</head>
<body>
		<button type="button" onclick="window.open('login','login_popup','width=900,height=1000,location=no,status=no,scrollbars=yes')">로그인</button>
		<button type="button" onclick="window.open('register','login_popup','width=900,height=1000,location=no,status=no,scrollbars=yes')">회원가입</button>
		<button type="button" onclick="javascript:ko();">테스트</button>
</body>
</html>