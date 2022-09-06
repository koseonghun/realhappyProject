package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {	
	public static String adminid = "hoon";
	public static String adminpw = "1234";
	public static String[] idDataBase = new String[8];
	public static String[] pwDataBase = new String[8];
	
	@RequestMapping("/register")
	public String registerForm() {
		
		return "/register/registerForm";
	}
	
	@Autowired UserService us;
	
	@RequestMapping("/registerbtn")
	public String register(UserVO vo) {
		
		us.register(vo);
		
		return "/login";
	}
	
	@RequestMapping("loginbtn")
	public String login(UserVO vo) {
		
		us.login(vo);
		
		return "";
	}
	
}
	
	/*
	 * @RequestMapping("loginbtn") public String login(@RequestParam String
	 * userid, @RequestParam String userpw) {
	 * 
	 * for (int i = 0; i < idDataBase.length; i++) { idDataBase[i] = "id" + i;
	 * pwDataBase[i] = "pw" + i; System.out.println(idDataBase[i]);
	 * System.out.println(pwDataBase[i]); } // 아이디 비밀 번호 설정 완료
	 * //System.out.println("아이디 정보 : " + idDataBase.toString());
	 * //System.out.println("비밀번호 정보 : " + pwDataBase.toString());
	 * 
	 * for (int y = 0; y < 8; y++) { System.out.println("입력값 : " + userid +
	 * "==?  데이터 베이스 아이디" + idDataBase[y]); System.out.println("입력값 : " + userpw +
	 * "==?  데이터 베이스 아이디" + pwDataBase[y]);
	 * 
	 * System.out.println(
	 * "==========================================================="); if
	 * (userid.equals(idDataBase[y])) { // 아이디 if (userpw.equals(pwDataBase[y])) {
	 * //System.out.println("아이디 비번 성공!"); return "successlogin"; //성공 }else {
	 * //System.out.println("비번 틀림"); return "check"; } } else if
	 * (userid.equals(adminid)) { //관리자 if (userpw.equals(adminpw)) { return
	 * "adminpage"; //관리자 } } } return "faillogin"; }
	 */

		

