package com.care.root;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.care.root.service.userService;

@Controller
public class RegistController {
	
	@Autowired
	userService service;
	
	@RequestMapping(value="/registerbtn", method=RequestMethod.POST)
	public String userinsert(Model model, HttpServletRequest request){
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String userpw2 = request.getParameter("userpw2");
		String username = request.getParameter("username");
		
		service.userRegister(userid, userpw, userpw2, username);
		
		model.addAttribute("userid",userid);
		model.addAttribute("userpw",userpw);
		model.addAttribute("userpw2",userpw2);
		model.addAttribute("username",username);
		
	return "/index";
		
	}
}
