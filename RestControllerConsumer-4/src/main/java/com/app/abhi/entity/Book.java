package com.app.abhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private String auth;

}
