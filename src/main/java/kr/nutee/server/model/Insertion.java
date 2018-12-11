package kr.nutee.server.model;

import lombok.Getter;

/**
 * Insertion enum class
 */

@Getter
public enum Insertion {
	FAIL(0), SUCCESS(1);

	private int code;

	/**
	 * enum constructor with code
	 * 
	 * @param code
	 */
	Insertion(int code) {
		this.code = code;
	}
}
