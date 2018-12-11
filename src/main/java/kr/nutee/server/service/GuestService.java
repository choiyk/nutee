package kr.nutee.server.service;

import kr.nutee.server.dto.User;

/**
 * GuestService interface
 */
public interface GuestService {

	/**
	 * @param User nickname, password, studentNumber, email
	 * @return insert recode count
	 */
	public abstract int signUp(User user);

}
