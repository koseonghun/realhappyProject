package com.care.root.member;

public interface UserMapper {

	public void register(UserVO vo);
	
	public UserVO login(UserVO vo);

	public int idcheck(String id);
	
	
	
}
