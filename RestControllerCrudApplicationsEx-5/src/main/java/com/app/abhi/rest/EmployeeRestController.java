package com.app.abhi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.abhi.entity.Employee;
import com.app.abhi.service.IServiceEmployee;
import com.app.abhi.serviceImpl.EmployeeNotFoundException;

import jakarta.xml.ws.Response;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private IServiceEmployee serv;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {

		serv.saveEmployee(employee);

		return ResponseEntity.ok("Employee '" + employee.getEmpId() + "'saved ");
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable("id") Integer id

	) {
		 ResponseEntity<Employee> response = null;
		
		try {
			Employee one = serv.getOneEmployee(id);
			response = new ResponseEntity<Employee>(one, HttpStatus.CREATED);
			
			
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		return response;

	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> allEmployee = serv.getAllEmployee();

		return ResponseEntity.ok(allEmployee);
	}

	@PutMapping("/change")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		
		
		
		ResponseEntity<String> response = null;
		
		try {
		Employee updateEmployee = serv.updateEmployee(employee);
		response = ResponseEntity.ok("Employee '" + employee.getEmpId() + "'Updated");
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable("id") Integer id) {

		
		ResponseEntity<String> response = null;
		try {
			serv.removeEmployee(id);
			response = ResponseEntity.ok("Employee '  " + id + "   ' Removed  ");
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		return response;

	}
}
