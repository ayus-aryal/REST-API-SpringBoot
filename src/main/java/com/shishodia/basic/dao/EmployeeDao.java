package com.shishodia.basic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishodia.basic.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}


// Step 2 - Create the DAO Interface
