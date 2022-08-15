package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	public static String adminid = "hoon";
	public static String adminpw = "1234";
	public static String[] idDataBase = new String[8];
	public static String[] pwDataBase = new String[8];

	@RequestMapping("loginbtn")
	public String login(@RequestParam String userid, @RequestParam String userpw) {

		for (int i = 0; i < idDataBase.length; i++) {
			idDataBase[i] = "id" + i;
			pwDataBase[i] = "pw" + i;
			System.out.println(idDataBase[i]);
			System.out.println(pwDataBase[i]);
		} // 아이디 비밀 번호 설정 완료
		System.out.println("아이디 정보 : " + idDataBase.toString());
		System.out.println("비밀번호 정보 : " + pwDataBase.toString());

		for (int y = 0; y <= 8; y++) {
			if (userid.equals(idDataBase[y])) {
				if (userpw.equals(pwDataBase[y])) {
					return "successlogin";
				}
				return "check";
			} else if (userid.equals(adminid)) {
				if (userpw.equals(adminpw)) {
					return "adminpage";
				}
			}
		}
		return "faillogin";	
	}
}
// if(userid.equals(adminid)) {
//			if(userpw.equals(adminpw)) {
//				return "successlogin";
//			}else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//			
//		}else {
//				System.out.println("아이디가 틀렸습니다.");
//		}
//		
//		return "faillogin";
