package com.care.root.mybatis;

import com.care.root.vo.UserVO;

public class UserDAOImpl implements UserDAO{
	

	@Override
	public void register(UserVO userVO) throws Exception {
		
		System.out.println(userVO+"여기까지오나?");
		
		
	}



		
}
