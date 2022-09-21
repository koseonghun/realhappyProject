package com.care.root.member;

public interface UserService {
	
	public void register(UserVO vo);
	
	public UserVO login(UserVO vo) ;

	public int idcheck(String id);
	
}
