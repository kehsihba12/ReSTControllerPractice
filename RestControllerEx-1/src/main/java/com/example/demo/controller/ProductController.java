package com.example.demo.controller;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/get")
	public ResponseEntity<String>getProduct(){
		
		ResponseEntity<String> response = new ResponseEntity<>("From get Methodd",HttpStatus.OK);
		
		return response;
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(){
		
		ResponseEntity<String> response =
				new ResponseEntity<>("From post Method",HttpStatus.OK);
		
		return response;
	
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(){
		
		ResponseEntity<String> response = 
				new ResponseEntity<>("From put method",HttpStatus.OK);
		
		return response;
	}
	@PatchMapping("/patch")
	public ResponseEntity<String> minUpdateProduct(){
		
		ResponseEntity<String> response = 
				new ResponseEntity<>("From Patch Method",HttpStatus.OK);
		return response;
		
	}
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteProduct(){
		
		
		ResponseEntity<String> response = 
				new ResponseEntity<>("From Delete Method",HttpStatus.OK);
		
		return response;
	}
 }
