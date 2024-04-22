package com.example.demo.rest;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	
	@GetMapping("/one")
	public ResponseEntity<User> getOneUser(){
		User u = new User(101,"Abhishek",500.0,"ABCD1234",Set.of("ab","bc"),new Role(1234,"devloper"));
		
		ResponseEntity<User> response = new ResponseEntity<>(u,HttpStatus.OK);
 		
		return response;
		
	}

}
