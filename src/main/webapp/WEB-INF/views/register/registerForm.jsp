<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 페이지 입니다.</h1>
<form action="registerbtn">
<table>
	<tr>
		<td>
			아이디 : 
		</td>
		<td>
			<input type="text" name="userid" placeholder="아이디를 입력하세요">
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
			<input type="text" name="username" placeholder="이름를 입력하세요">
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