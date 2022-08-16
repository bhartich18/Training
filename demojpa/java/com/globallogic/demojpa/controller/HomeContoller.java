package com.globallogic.demojpa.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.demojpa.entity.DeptEntity;
import com.globallogic.demojpa.entity.EmployeeEntity;
import com.globallogic.demojpa.repo.DeptRepo;
import com.globallogic.demojpa.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class HomeContoller {

	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	DeptRepo deptRepo;
	
	//use the GET All the data 
	@GetMapping()
	public List<EmployeeEntity> showEmpoyee()
	{
		//return all the value from the tables
		return repo.findAll();
		
	}
	
	//POST request
	   //each time it will create a new data request
	   //will send the data with body
	@PostMapping()
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity  emp)
	{
		System.out.println("dept  "+emp.getDept());
		
		DeptEntity entity=deptRepo.findById(emp.getDept().getId()).get();
		
		System.err.println("dept id"+entity);
		
		emp.setDept(entity);
		System.err.println(emp);
		repo.save(emp);
		System.err.println(emp);
		return emp;
	}
	
	//it is use to update the resource on the server
	
	@PutMapping()
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity  emp)
	{
	
		
		repo.save(emp);
		System.err.println(emp);
		return emp;
	}
	
	
	//delete : it is used to delete the resource on the server
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}
	
	
	
}
