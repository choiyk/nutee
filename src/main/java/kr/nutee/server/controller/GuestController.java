package kr.nutee.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.nutee.server.dto.User;
import kr.nutee.server.model.Insertion;
import kr.nutee.server.service.GuestService;

/**
 * GuestController class
 */
@RestController
@RequestMapping("guest")
public class GuestController {

	@Autowired
	GuestService guestService;

	/**
	 * @param User nickname, password, studentNumber and email
	 * @return ResponseEntity<Void>
	 */
	@PostMapping("/signUp")
	public ResponseEntity<Void> signUp(final User user) {
		if (Insertion.SUCCESS.getCode() == guestService.signUp(user))
			return new ResponseEntity<Void>(HttpStatus.OK);
		else
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	}

}
