package kr.nutee.server.repository.mapper;

import kr.nutee.server.dto.User;

/**
 * GuestMapper interface
 */
public interface GuestMapper {
	
	/**
	 * @param User nickname, password, studentNumber, email
	 * @return insert record count
	 */
	public abstract int signUp(User user);
}
