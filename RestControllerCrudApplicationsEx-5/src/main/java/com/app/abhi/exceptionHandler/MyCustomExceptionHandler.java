package com.app.abhi.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.abhi.serviceImpl.EmployeeNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler {
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> employeeNotEmployeeFound(
			EmployeeNotFoundException e
			){
		
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
