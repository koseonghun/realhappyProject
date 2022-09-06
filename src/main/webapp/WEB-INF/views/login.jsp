<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<form action="loginbtn">
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
			<tr>
				<td>
					비밀번호 재입력 
				</td>
				<td>
				<input type="password" id="userpw2" name="userpw2"placeholder="비밀번호 다시 입력해주세요">
				</td>
			</tr>
		</table>
		<button type="button" id="signup" onclick="location.href='/register'">회원가입</button>
		<button type="submit" id="loginbtn">로그인</button>
</form>

 </body>
</html>