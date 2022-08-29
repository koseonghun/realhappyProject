package com.care.root.mybatis;

import com.care.root.vo.UserVO;

public interface UserDAO {

	void register(UserVO userVO) throws Exception;

	void register(String userVO) throws Exception;
	
}
