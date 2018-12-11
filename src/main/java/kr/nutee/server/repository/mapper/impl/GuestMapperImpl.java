package kr.nutee.server.repository.mapper.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.nutee.server.dto.User;
import kr.nutee.server.repository.mapper.GuestMapper;

/**
 * GuestMapper Implementation
 */
@Repository
public class GuestMapperImpl implements GuestMapper {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int signUp(final User user) {
		return sqlSession.insert("signUp", user);
	}

}
