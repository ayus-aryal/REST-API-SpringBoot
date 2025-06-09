package com.shishodia.basic.service;

import java.util.List;

import com.shishodia.basic.entity.Employee;

public interface EmployeeService {

	String addRecord(Employee employee);
	
	List<Employee> findAllRecords();
	
	Employee findRecord(Integer empNo);
	
	String removeRecord(Integer empNo);
	
	String updateRecord(Employee employee);
	
}


// Step 3 - Create the Service Interface
