package com.care.root.service;

import org.springframework.stereotype.Service;

import com.care.root.vo.UserVO;

@Service
public interface UserService {

		void userRegister(UserVO userVO) throws Exception;

		
		
}
