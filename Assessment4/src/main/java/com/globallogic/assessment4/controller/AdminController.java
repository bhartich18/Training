package com.globallogic.assessment4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment4.entity.Admin;
import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Staff;
import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.services.AdminService;
import com.globallogic.assessment4.services.ExamService;
import com.globallogic.assessment4.services.ResultService;
import com.globallogic.assessment4.services.StaffService;
import com.globallogic.assessment4.services.StudentService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminservice;
	@Autowired
	ExamService examservice;
	@Autowired
	ResultService resultservice;
	@Autowired
	StaffService staffservice;
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/")
	public List<Admin> showalldet(){
		return adminservice.alldetails();
	}
	
	@GetMapping("/staff")
	public List<Staff> showStaffdet(){
		return staffservice.alldetails();
		}
	
	@GetMapping("/student")
	public List<Student> showStudentdetails(){
		return studentservice.showdetails();
		}
	
	@GetMapping("/exam")
	public List<Exam> showexamdetails(){
		return examservice.alldetails();
		}
	
	
	@GetMapping("/name")
	public List<String> showallStudentname(){
		return adminservice.showName();
	}

	
	@PostMapping("/")
	public String addall(@RequestBody Admin ad) {
		return  adminservice.adddetails(ad);
	}

	@PostMapping("/Staff")
	public String addstaffdet(@RequestBody Staff st) {
		return staffservice.adddet(st);
	}

	
	
	
	
	
	@PostMapping("/exam")
	public String addexamdet(@RequestBody Exam exam) {
		System.out.println(exam);
		return examservice.adddetails(exam);
	}
	
	
	
	
	@PostMapping("/result")
	public String addresultdet(@RequestBody Result st) {
		return resultservice.adddetails(st);
	}
	@PostMapping("/student")
	public String addstudentdet(@RequestBody Student st) {
		return studentservice.adddetails(st);
	}
	
}
