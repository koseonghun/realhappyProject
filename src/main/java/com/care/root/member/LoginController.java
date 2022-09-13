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
		
		System.out.println(id);
		
		return "1";
	}
	
	
	/*
	 * //GetMapping 형식
	 * 
	 * @GetMapping("idcheck")
	 * 
	 * @ResponseBody //결과값을 result로 보내준다 public String idcheck(@RequestParam String
	 * id) {
	 * 
	 * System.out.println(id);
	 * 
	 * return "1"; }
	 */
	
/*
 * @PostMapping("namecheck")
 * @ResponseBody public String namecheck(@RequestParam String name) {
 * System.out.println(name);
 * return "name"; }
 * 
 * }
 */
	@GetMapping("namecheck")
	@ResponseBody
	public String namecheck(@RequestParam String name) {
		
		System.out.println(name);
		
		return "name";
	}
}

/*
 * @RequestMapping("loginbtn") 
 * public String login(@RequestParam String userid, @RequestParam String userpw) {
 * 
 * for (int i = 0; i < idDataBase.length; i++) { 
 * idDataBase[i] = "id" + i;
 * pwDataBase[i] = "pw" + i; 
 * System.out.println(idDataBase[i]);
 * System.out.println(pwDataBase[i]); } // 아이디 비밀 번호 설정 완료
 * 
 * for (int y = 0; y < 8; y++) { 
 *		 if (userid.equals(idDataBase[y])) { // 아이디 
 * 			if (userpw.equals(pwDataBase[y])) {
 * 		//System.out.println("아이디 비번 성공!"); 
 *				return "successlogin"; //성공 
 * 		}else {
 * 		//System.out.println("비번 틀림"); 
 * 				return "check"; 
 * 		} 
 * } 
 * else if (userid.equals(adminid)) { //관리자 
 * if (userpw.equals(adminpw)) { 
 * return "adminpage"; //관리자 } 
 * } 
} 
return "faillogin"; }
 */
