package com.app.abhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




public class MessageController {
	
	
	
	@GetMapping("/greet")
	public String getMethodName() {
		
		return "welcome to page";
	}
	
	
		
	}

}
