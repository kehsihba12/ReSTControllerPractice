package com.app.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


@Data
public class Student {
	
	
	private Integer sid;
	
	private String sname;
	
	private String sgender;
	
	@Autowired
	private Course course;
	
	private List<String> lang;
	
	

}
