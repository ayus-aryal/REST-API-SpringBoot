package com.shishodia.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	
}


// Step 5 - Create the Controller Class.