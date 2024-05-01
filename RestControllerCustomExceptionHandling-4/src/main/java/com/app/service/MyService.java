package com.app.service;

import org.springframework.stereotype.Service;
import com.app.exception.UserNotFoundException;
import com.app.user.User;

@Service
public class MyService {
	
	
	public User getUser(Integer id){
		
		if(id == 233) {
			
			return new User(233, "abhishek", "R");
			
		}
		else {
			throw new UserNotFoundException("User '" + id+ "' not Found" );
		}
		
		
	}

}
