package kr.nutee.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.nutee.server.dto.User;
import kr.nutee.server.repository.mapper.GuestMapper;
import kr.nutee.server.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {
	
	@Autowired
	GuestMapper guestMapper;

	@Override
	public void signUp(User user) {
		guestMapper.signUp(user);
	}

}
