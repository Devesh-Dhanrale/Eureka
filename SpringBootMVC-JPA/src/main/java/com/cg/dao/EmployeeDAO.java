package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
import com.cg.entity.Employee;

@Repository("empDao")
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	
	
	
}
