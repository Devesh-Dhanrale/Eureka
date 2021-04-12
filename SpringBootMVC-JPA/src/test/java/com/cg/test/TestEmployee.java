package com.cg.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

import com.cg.dao.EmployeeDAO;
import com.cg.entity.Employee;
import com.cg.services.EmployeeServices;
import com.cg.services.EmployeeServicesIMP;

import ch.qos.logback.core.Context;


@SpringBootTest
public class TestEmployee {

	
	private MockMvc mockmvc;
	@Mock
	EmployeeDAO dao;
	
	@Autowired
	private WebApplicationContext context;
	
	@InjectMocks
	EmployeeServicesIMP emp;
	
	
	@BeforeAll
	public void setup()
	{

			
	}
	@Test
	public void insertmp()
	{
		Employee e=new Employee(101,"devesh","Testing",50000);
		
		/*
		 * emp.addEmployee(e);
		 * 
		 * emp.getEmployeeById(101);
		 */			

		assertThat(emp.addEmployee(e)).isEqualTo(emp.getEmployeeById(101));
		
		
	}
	
	
}
