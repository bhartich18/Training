package com.globallogic.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.globallogic.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	 
    public EmployeeDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
	public EmployeeDAOImpl(DriverManagerDataSource datasource) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(Employee e) {
		String sql="INSERT INTO Employee(id,first_name,last_name,username,password,email,address,phone) VALUES(?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,e.getid(),e.getFirst_name(),e.getLast_name(),e.getUsername(),e.getPassword(),e.getEmail(),e.getAddress(),e.getPhone());
	}

	@Override
	public int update(Employee employee) {
		return 0;

	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
