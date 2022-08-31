package com.care.root.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.mybatis.UserDAO;
import com.care.root.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
   @Autowired
   UserDAO userDAO;
	
	@Override
	public void userRegister(UserVO userVO) throws Exception {
		userDAO.register(userVO);
		
	}
	
}
