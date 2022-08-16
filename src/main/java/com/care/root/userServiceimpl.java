package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.mybatis.MemberDAO;

@Service
public class userServiceimpl implements userService {

	@Inject
	MemberDAO membermapper;
	
	@Override
	public void userjoin(UserVO vo) throws Exception{
		
		membermapper.userjoin(vo);
	}
	
	
}
