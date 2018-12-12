package kr.nutee.server.repository.mapper;

import kr.nutee.server.dto.User;

/**
 * GuestMapper interface
 */
public interface GuestMapper {
	
	/**
	 * @param User object to be sign up
	 * @return insert record count
	 */
	public abstract int signUp(User user);
}
