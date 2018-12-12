package kr.nutee.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.nutee.server.dto.User;
import kr.nutee.server.service.UserService;

/**
 * UserController class
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;

	/**
	 * @param User
	 *            Object to be update
	 * @return ResponseEntity<Void>
	 */
	@PutMapping("/update")
	public ResponseEntity<Void> signUp(final User user) {
		userService.update(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
