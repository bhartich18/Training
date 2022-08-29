package com.globallogic.assessment4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.services.ExamService;
import com.globallogic.assessment4.services.ResultService;
import com.globallogic.assessment4.services.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	ExamService examservice;
	@Autowired
	ResultService resultservice;	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/")
	public List<Student> show(){
	return	studentservice.showdetails();
	}

}
