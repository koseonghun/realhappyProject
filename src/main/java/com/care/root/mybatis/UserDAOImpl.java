package com.care.root.mybatis;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.care.root.vo.UserVO;

public class UserDAOImpl implements UserDAO{

	private final SqlSession sqlSession;
	
	@Inject
	public UserDAOImpl(SqlSession sqlSession)
	this.sqlSession = sqlSession;
	
}


	@Override
	public void register(String userVO) throws Exception {
		sqlSession.insert(userVO);
	}


	@Override
	public void register(UserVO userVO) throws Exception {
		sqlSession.insert(userVO);
		
	}
		
}
