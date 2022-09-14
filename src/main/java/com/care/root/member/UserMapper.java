package com.care.root.member;

public interface UserMapper {

	public void register(UserVO vo);
	
	public void login(UserVO vo);

	public void idcheck(String id);
	
	
	
}
