package com.app.errorresponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorResponse {
	
	
	private String data;
	
	private String status;
	
	private int code;
	
	private String Messege;

}
