package kr.nutee.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.nutee.server.dto.User;
import kr.nutee.server.service.GuestService;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "guest")
public class GuestController {

	@Autowired
	GuestService guestService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping(value = "/signUp/{nickname}/{password}/{studentNumber}/{email}")
	public ResponseEntity<Void> signUp(@PathVariable String nickname, @PathVariable String password,
			@PathVariable int studentNumber, @PathVariable String email) {
		guestService.signUp(new User(nickname, password, studentNumber, email));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
