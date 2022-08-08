package com.globallogic.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.globallogic.model.Employee;

class EmployeeDAOTest {
private DriverManagerDataSource datasource;
private EmployeeDAO dao;
	@Test
	void testSave() {
		datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/employeedb");
		datasource.setUsername("root");
		datasource.setPassword("root");
		dao=new EmployeeDAOImpl(datasource);
		
		Employee employee=new Employee(100,"Bharti","Chahal","bharti","abc","bharti@gmail.com","Hapur","98999999");
		int result=dao.save(employee);
		assertTrue(result>0);
		
	}
}

//	@Test
//	void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testList() {
//		fail("Not yet implemented");
//	}
//
//}
