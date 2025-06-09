package com.shishodia.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shishodia.basic.dao.EmployeeDao;
import com.shishodia.basic.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public String addRecord(Employee employee) {
		dao.save(employee);
		return "Record added successfully!!!";
	}
	
}


// Step 4 - Implement the Service Interface.