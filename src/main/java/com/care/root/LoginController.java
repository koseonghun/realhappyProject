package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	public static String adminid = "hoon";
	public static String adminpw = "1234";

	@RequestMapping("loginbtn")
	public String login(@RequestParam String userid, @RequestParam String userpw) { 
		
		
		if(userid.equals(adminid)) {
			if(userpw.equals(adminpw)) {
				return "successlogin";
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}else {
				System.out.println("아이디가 틀렸습니다.");
		}
		
		return "faillogin";
				
		
	}
}

