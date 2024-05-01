package com.app.abhi.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	private Logger log =  LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/welcome")
	public String getmessage() {
		
		log.info("welocome method started execution............");
		String msg = "Welcome to my page";
		int a = 10;
		int b = 0;
		int c = a/b;
		log.info("welcome msg ended execution.........");
		return msg;
	}
	
	
	@GetMapping("/greet")
	public String greetMsg() {
		log.info("greet method started execution............");
		String s = null ;
		s.length();
		log.info("greet method started execution............");
		return "Hi Good AfterNoon";
		
	}

}
