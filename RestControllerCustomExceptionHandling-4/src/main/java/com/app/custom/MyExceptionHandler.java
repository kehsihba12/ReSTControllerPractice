package com.app.custom;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.errorresponse.MyErrorResponse;
import com.app.exception.UserNotFoundException;

@RestControllerAdvice
public class MyExceptionHandler {
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MyErrorResponse> handler(UserNotFoundException unfe){
		
		
		return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(
				new Date().toString(),"Exception in process",500,unfe.getMessage()
				),HttpStatus.INTERNAL_SERVER_ERROR) ;
	}

}
