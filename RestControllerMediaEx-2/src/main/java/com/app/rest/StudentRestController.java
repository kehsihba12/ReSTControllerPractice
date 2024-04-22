package com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		
		String s = student.toString();
		
		ResponseEntity<String> response = new ResponseEntity<>(s,HttpStatus.OK);
		
		return response;
	}

}
