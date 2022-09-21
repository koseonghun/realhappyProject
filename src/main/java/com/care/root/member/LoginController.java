package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/register")
	public String registerForm() {

		return "/register/registerForm";
	}

	@Autowired
	UserService us;

	@PostMapping("/registerbtn")
	public String register(UserVO vo) {
		
		us.register(vo);

		return "/login";
	}
	
	@RequestMapping("loginbtn")
	public String login(UserVO vo) {
		
		UserVO login = us.login(vo);
		
		if(login==null) {
			System.out.println("실패!!!!!!!!!!!!!!!!!!"+login);
			System.out.println("없는아이디 비번임.");
			return "/faillogin";
		}else {
			System.out.println("성공!!!!!!!!!!!!!!!!!!"+login);
			return "/main";
		}
	}
	
	@PostMapping("idcheck")
	@ResponseBody
	public int idcheck(@RequestParam String id) {
		
		System.out.println("받아온 값!!"+id);
		
		int idcheck = us.idcheck(id);
		
		System.out.println("넘겨주는 값!!"+idcheck);
		
		return idcheck;
	}
	
	
	
}


