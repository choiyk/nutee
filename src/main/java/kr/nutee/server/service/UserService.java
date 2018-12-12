package kr.nutee.server.service;

import kr.nutee.server.dto.User;

/**
 * UserService interface
 */
public interface UserService {
	
	/**
	 * @param User object to be update
	 */
	public abstract void update(User user);
}
