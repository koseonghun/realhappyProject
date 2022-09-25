package com.care.root.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@RequestMapping("/main")
	public String main() {
		
		return "/main";
	}
	
	@RequestMapping("homepage")
	public String homepage() {
		
		return "/homepage";
	}
	
	
	@Autowired
	UserService us;

	@PostMapping("/registerbtn")
	public String register(UserVO vo) {
		
		us.register(vo);

		return "/login";
	}
	
	@PostMapping("loginbtn")
	@ResponseBody
	public UserVO login(@RequestParam String id, @RequestParam String pw){
		
		System.out.println(id);
		System.out.println(pw);
		
		UserVO vo = new UserVO();
		
		vo.setUserid(id);
		vo.setUserpw(pw);
		
		UserVO login = us.login(vo);
		
		System.out.println("controller!!!!!!!!"+login);
		
		return login;
		
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


