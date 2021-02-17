package com.karadagserhat.springboot.thymeleaff.service;

import java.util.List;

import com.karadagserhat.springboot.thymeleaff.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
