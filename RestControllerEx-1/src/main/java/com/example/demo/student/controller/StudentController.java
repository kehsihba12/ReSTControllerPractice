package com.example.demo.student.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@GetMapping("/get")
	public ResponseEntity<String> getProduct(){
		
		ResponseEntity<String> response = new ResponseEntity<>("Fromm get Method",HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(){
		
		ResponseEntity<String> response = new ResponseEntity<>("From Post method",HttpStatus.OK);
		return response;
	
	}
	@PostMapping("/put")
	public ResponseEntity<String> updateProduct(){
		
		
		ResponseEntity<String> response = new ResponseEntity<>("froom update method",HttpStatus.OK);
		
		return response;
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> patchProduct(){
		
		ResponseEntity<String> response = new ResponseEntity<>("From patch method",HttpStatus.OK);
				return response;
	}	
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeProduct(){
		
		ResponseEntity<String> response = new ResponseEntity<>("from delete Method",HttpStatus.OK);
		return response;
	}

	
}
