package com.care.root.mybatis;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.care.root.UserVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sql;
	
	@Override
	public void userjoin(UserVO vo) throws Exception {
		
		sql.insert("memberMapper.register",vo);
	}
	
	

}
