package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.UserNotFoundException;
import com.app.service.MyService;
import com.app.user.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private MyService service;
	
	@GetMapping("/one/{id}")
	public ResponseEntity<User> checkUser(
			
			@PathVariable("id") Integer id
			){
		ResponseEntity<User> response = null;
		try {
			User user = service.getUser(id);
			response = new ResponseEntity<User>(user,HttpStatus.OK);
		}catch (UserNotFoundException unfe) {
			unfe.printStackTrace();
			throw unfe;
		}
		
		return response;
		
		
	}
	
	
	

}
