package kr.nutee.server.dto;

public class User {
	private String nickname;
	private String password;
	private int studentNumber;
	private String email;

	public User(String nickname, String password, int studentNumber, String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.studentNumber = studentNumber;
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
