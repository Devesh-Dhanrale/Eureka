package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDAO;
import com.cg.entity.Employee;


@Service
public class EmployeeServicesIMP implements EmployeeServices {

	@Autowired
	EmployeeDAO empdao;
	
	
	
	@Override
	public List<Employee> addEmployee(Employee e) {
		
		System.out.println("Inserting and emp");
	
		empdao.saveAndFlush(e);
		
		return empdao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		
		
		
		return null;
	}

	

	@Override
	public List<Employee> getAllEmployee() {
		
		return empdao.findAll();
	}

	@Override
	public List<Employee> deleteEmployee(Integer empId) {
		
		System.out.println("Delete an emp using empid");				
		empdao.deleteById(empId);

		return empdao.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		
		Optional<Employee> e=empdao.findById(empId);
		return e.get();
		
	}

	@Override
	public List<Employee> addEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
