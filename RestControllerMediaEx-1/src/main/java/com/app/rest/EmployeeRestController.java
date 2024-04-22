package com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		
		String s = employee.toString();
		
		ResponseEntity<String> response = new ResponseEntity<>(s,HttpStatus.OK);
		
		return response;
	}

}
