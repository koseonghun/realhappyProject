package com.care.root.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.care.root.vo.UserVO;

public interface UserService {

		void userRegister(UserVO userVO) throws Exception;

		
		
}
