package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.services.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired 
	EmployeeServices employeeServices;
	
	
	@GetMapping("/find")
	public List<Employee> getAllEmp()
	{
		return employeeServices.getAllEmployee();
	}
	
	
	@GetMapping("/find/{id}")
	public Employee getEmpById(@PathVariable Integer id)
	{
		return employeeServices.getEmployeeById(id);
	}
	
	
	@GetMapping("/delete/{id}")
	public List<Employee> deleteEmpById(@PathVariable Integer id)
	{
		return employeeServices.deleteEmployee(id);
	}
	

	

	

	@PostMapping("/insert")

	public List<Employee> insertEmp( Employee e)
	{
		
		return employeeServices.addEmployee(e);
	}
	

	
	
}
