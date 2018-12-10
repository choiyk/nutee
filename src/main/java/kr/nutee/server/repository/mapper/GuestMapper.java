package kr.nutee.server.repository.mapper;

import kr.nutee.server.dto.User;

public interface GuestMapper {
	public abstract void signUp(User user);
}
