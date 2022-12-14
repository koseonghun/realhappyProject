package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class UserServiceImpl implements UserService {

	@Autowired UserMapper mapper;
	
	@Override
	public void register(UserVO vo) {
		
		System.out.println(vo.getUserid());
		System.out.println(vo.getUserpw());
		System.out.println(vo.getUserpw2());
		System.out.println(vo.getUsername());
		
		mapper.register(vo);
		
	}

	
	 @Override 
	 public UserVO login(UserVO vo) {
	 
	 System.out.println(vo.getUserid()+"로그인");
	 System.out.println(vo.getUserpw()+"로그인");
	 
	 
	 System.out.println("*******************"+vo); 
	 return mapper.login(vo);
	 
	 }
	 

	@Override
	public int idcheck(String id) {
		
		System.out.println("serviceImpl!!!"+id);
		
		return mapper.idcheck(id);
		
	}
}
