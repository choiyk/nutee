package kr.nutee.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.nutee.server.dto.User;
import kr.nutee.server.repository.mapper.UserMapper;
import kr.nutee.server.service.UserService;

/**
 * UserService Implementation
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void update(final User user) {
		userMapper.update(user);
	}

}
