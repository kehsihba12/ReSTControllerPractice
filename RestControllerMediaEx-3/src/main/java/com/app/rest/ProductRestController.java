package com.app.rest;


import java.util.Enumeration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class ProductRestController {
	
	@GetMapping("/map")
	public ResponseEntity<String> getOne(
			
			@RequestParam("pid") Integer id,
			@RequestParam("pname")String name
			
			){
		
		System.out.println("pid" + id + " " + "pname"+ name);
		
		
		return new ResponseEntity<>("pid  = " + id + ", " + "pname  = "+ name,HttpStatus.OK);
	}
	
	@GetMapping("/tab/{pid}/{pname}")
	public ResponseEntity<String> getOneProduct(
			
			@PathVariable("pid") Integer id,
			@PathVariable("pname") String name,
			HttpServletRequest req
			
			){
		
		Enumeration<String> headers = req.getHeaders(name);
		
		while (headers.hasMoreElements()) {
			String string = (String) headers.nextElement();
			System.out.println(string);
			
		}
		
		return new ResponseEntity<>(id + " " + name,HttpStatus.OK);
		
	}
	

}
