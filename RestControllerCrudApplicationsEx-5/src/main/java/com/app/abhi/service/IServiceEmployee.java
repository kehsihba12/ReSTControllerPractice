package com.app.abhi.service;

import java.util.List;

import com.app.abhi.entity.Employee;

public interface IServiceEmployee {
	
	public void saveEmployee(Employee e);
	
	public Employee updateEmployee(Employee e);
	
	
	public List<Employee> getAllEmployee();
	
	
	public Employee getOneEmployee(Integer id);
	
	public void removeEmployee(Integer id);

}
