package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("loginbtn")
	public String login(@RequestParam String userid, @RequestParam String userpw) { 
		
		System.out.println(userid);
		System.out.println(userpw);
		
			
		return "successlogin";
	
		
	}
}
