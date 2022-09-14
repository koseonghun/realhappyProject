package com.care.root.member;

public interface UserService {
	
	public void register(UserVO vo);
	
	public void login(UserVO vo);

	public void idcheck(String id);
	
}
