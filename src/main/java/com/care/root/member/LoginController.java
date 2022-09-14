package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

	@RequestMapping("/registerbtn")
	public String register(UserVO vo) {

		us.register(vo);

		return "/login";
	}

	@RequestMapping("loginbtn")
	public String login(UserVO vo) {

		us.login(vo);

		return "/main";
	}
	
	@PostMapping("idcheck")
	@ResponseBody
	public String idcheck(@RequestParam String id) {
		
		us.idcheck(id);
		System.out.println("controller!!!"+id);
		System.out.println("값을 가져오긴하는데 어케 가져와서 나눠야할까");
		
		if(id==null) {
			System.out.println("userlist 테이블에 존재하면 여기로와야지..");
			return "0";
		}else {
			System.out.println("id에 값이 없을때 return 1을 주긴하는데..흠");
			return "1";
		}
	}
	
}


