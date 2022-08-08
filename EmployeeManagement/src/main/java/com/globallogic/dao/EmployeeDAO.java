package com.globallogic.dao;

import java.util.List;

import com.globallogic.model.Employee;

public interface EmployeeDAO {
	public int save(Employee employee);
	public int update(Employee employee);
    public void delete(String username);
     
    public Employee get(String username);
     
    public List<Employee> list();
}
