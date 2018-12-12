package kr.nutee.server.service;

import kr.nutee.server.dto.User;

/**
 * GuestService interface
 */
public interface GuestService {

	/**
	 * @param User object to be sign up
	 * @return insert recode count
	 */
	public abstract int signUp(User user);

}
