package com.care.root.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.care.root.mybatis.UserDAO;
import com.care.root.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	private final UserDAO userDAO;
	
	@Inject
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO=userDAO;
	}

	@Override
	public void userRegister(UserVO userVO) throws Exception {
		userDAO.register(userVO);
		
	}
	
}
