package com.shishodia.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shishodia.basic.entity.Employee;
import com.shishodia.basic.service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public String addRecord(@RequestBody Employee employee) {
		return service.addRecord(employee);
	}
	
	
	@GetMapping
	public List<Employee> findAllRecords(){
		return service.findAllRecords();
	}
	
	@GetMapping("/{empNo}")
	public Employee findRecord(@PathVariable Integer empNo) {
		return service.findRecord(empNo);
	}
	
	
	@DeleteMapping("/{empNo}")
	public String removeRecord(@PathVariable Integer empNo) {
		return service.removeRecord(empNo);

	}
	
	@PutMapping
	public String updateRecord(@RequestBody Employee employee) {
		return service.updateRecord(employee);
	}

}


// Step 5 - Create the Controller Class.