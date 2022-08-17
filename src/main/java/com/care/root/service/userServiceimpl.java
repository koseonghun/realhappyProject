package com.care.root.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.mybatis.MemberDAO;

@Service
public class userServiceimpl implements userService {

	@Autowired
	private MemberDAO dao;

	@Override
	public void userRegister(String userid, String userpw, String userpw2, String username) {
	
		dao.userinsert(userid, userpw, userpw2, username);
		
	}

}
