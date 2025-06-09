package com.shishodia.basic.service;

import java.util.List;

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
	
	@Override
	public List<Employee> findAllRecords(){
		return dao.findAll();
	}
	
	@Override
	public Employee findRecord(Integer empNo) {
		return dao.findById(empNo).get();
	}

	@Override
	public String removeRecord(Integer empNo) {
		dao.deleteById(empNo);
		return "Record deleted";
	}

	@Override
	public String updateRecord(Employee employee) {
		dao.save(employee);
		return "Record updated!";
	}
	
	
	
}


// Step 4 - Implement the Service Interface.