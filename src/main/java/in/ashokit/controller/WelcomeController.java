package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	
	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage() {

		String message = welcomeService.getMessage();
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
