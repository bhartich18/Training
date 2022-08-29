package com.globallogic.assessment4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Staff;
import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.services.ExamService;
import com.globallogic.assessment4.services.ResultService;
import com.globallogic.assessment4.services.StaffService;
import com.globallogic.assessment4.services.StudentService;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	@Autowired
	ExamService examservice;
	@Autowired
	ResultService resultservice;
	@Autowired
	StaffService staffservice;
	@Autowired
	StudentService studentservice;
	
	
	@GetMapping("/")
	public List<Staff> showalldetails(){
		return staffservice.alldetails();
	}
	
	@GetMapping("/student")
	public List<Student> showallstuddetails(){
		return studentservice.showdetails();
	}
	
	
	@GetMapping("/exam")
	public List<Exam> showexamdetails(){
		return examservice.alldetails();
		}
	
	
	@GetMapping("/name")
	public List<String> showallStudentname(){
		return staffservice.showName();
	}
	
	@PostMapping("/exam")
	public String addexamdetails(@RequestBody Exam st) {
		return examservice.adddetails(st);
	}
	@PostMapping("/result")
	public String addresultdet(@RequestBody Result st) {
		return resultservice.adddetails(st);
	}
	@PostMapping("/student")
	public String addstudentdetails(@RequestBody Student st) {
		System.out.println(st);
		return  studentservice.adddetails(st);
	}
}
