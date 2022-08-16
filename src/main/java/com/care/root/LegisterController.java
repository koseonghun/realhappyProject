package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.root.userService;

@Controller
public class LegisterController {

	@Autowired
	private userService userservice;
	
	@RequestMapping("registerbtn")
	public String register(UserVO vo) throws Exception { 
		
		userservice.userjoin(vo);
				
		System.out.println("join성공!");
		
		return "redirect:/";
	}
}
