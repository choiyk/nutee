package kr.nutee.server.repository.mapper.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.nutee.server.dto.User;
import kr.nutee.server.repository.mapper.UserMapper;

/**
 * UserMapper Implementation
 */
@Repository
public class UserMapperImpl implements UserMapper {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void update(final User user) {
		sqlSession.update("update", user);		
	}
}
