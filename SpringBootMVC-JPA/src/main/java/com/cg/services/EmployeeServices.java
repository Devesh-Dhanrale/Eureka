package com.cg.services;

import java.util.List;

import com.cg.entity.Employee;

public interface EmployeeServices {

	public List<Employee> addEmployee(Employee e);
	
	public List<Employee> updateEmployee(Employee e);
	
	public List<Employee> addEmployee(Integer  empId);
	
	public List<Employee> getAllEmployee();
	
	public List<Employee>  deleteEmployee(Integer  empId);
	
	public Employee getEmployeeById(Integer empId);
	
	
}
