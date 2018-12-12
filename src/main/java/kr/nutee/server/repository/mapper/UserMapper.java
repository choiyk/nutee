package kr.nutee.server.repository.mapper;

import kr.nutee.server.dto.User;

/**
 * UserMapper interface
 */
public interface UserMapper {

	/**
	 * @param User object to be sign up
	 */
	public abstract void update(User user);
}
