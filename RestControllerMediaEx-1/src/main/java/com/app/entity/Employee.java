package com.app.entity;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	
	private Integer empId;
	
	private String empName;
	
	private Double empSal;
	
	private String empDept;
	
	@Autowired
	private Department dept;

}
