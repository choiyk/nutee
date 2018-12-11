package kr.nutee.server.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User DTO
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
	private String nickname;
	private String password;
	private int studentNumber;
	private String email;

	/**
	 * Default protected constructor
	 */
	protected User() {}
	
	/**
	 * User constructor with nickname, password, studentNumber and email
	 * 
	 * @param nickname
	 * @param password
	 * @param studentnumber
	 * @param email
	 */
	public User(String nickname, String password, int studentNumber, String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.studentNumber = studentNumber;
		this.email = email;
	}

}
