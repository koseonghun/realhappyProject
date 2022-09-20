package com.care.root.member;

public interface UserService {
	
	public void register(UserVO vo);
	
	public void login(UserVO vo);

	public int idcheck(String id);
	
}
