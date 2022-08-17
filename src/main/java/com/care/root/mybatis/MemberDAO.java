package com.care.root.mybatis;

import com.care.root.vo.UserVO;

public interface MemberDAO {

	void userinsert(String userid, String userpw, String userpw2, String username);
	
}
