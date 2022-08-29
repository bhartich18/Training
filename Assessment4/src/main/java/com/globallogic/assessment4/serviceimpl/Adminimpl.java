package com.globallogic.assessment4.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment4.entity.Admin;
import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.repo.AdminRepo;
import com.globallogic.assessment4.repo.ExamRepo;
import com.globallogic.assessment4.repo.StaffRepo;
import com.globallogic.assessment4.services.AdminService;
import com.globallogic.assessment4.services.ExamService;
import com.globallogic.assessment4.services.ResultService;
import com.globallogic.assessment4.services.StudentService;

@Component
public class Adminimpl implements AdminService{
@Autowired
AdminRepo adminrepo;

@Autowired
StaffRepo staffrepo;

@Autowired
StudentService studentservice;

@Autowired
ExamRepo examrepo;

@Autowired
ResultService resultservice;

	@Override
	public String adddetails(Admin ad) {
		adminrepo.save(ad);
		return "Data addedd Successfully";
	}
/*
	
*/
	@Override
	public List<String> showName() {
		
		return studentservice.showStudentName();
	}

	@Override
	public List<Result> addResult() {
		
		return resultservice.alldetails();
	}

	@Override
	public String addExam(Exam ex) {
		examrepo.save(ex);
		return "Details added Sucessfully";
	}

	@Override
	public String addStudent(Student s) {
		resultservice.addStudent(s);
		return "Data addedd Sucessfully";
	}

	@Override
	public List<Admin> alldetails() {
		
		return adminrepo.findAll();
	}

}
