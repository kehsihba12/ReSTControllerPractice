package com.example.demo.entity;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Integer userId;
	
	private String userName;
	
	private Double userSalary;
	@JsonIgnore
	private String Password;
	
	Set<String> roles;
	
	@Autowired
	private Role role;
	
}
