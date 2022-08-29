package com.globallogic.assessment4.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.repo.ExamRepo;
import com.globallogic.assessment4.repo.ResultRepo;
import com.globallogic.assessment4.repo.StudentRepo;
import com.globallogic.assessment4.services.StudentService;
@Component
public class Studentserviceimpl implements StudentService{
@Autowired
StudentRepo studentrepo;
@Autowired
ResultRepo resultrepo;
@Autowired 
ExamRepo examrepo;


	@Override
	public List<Student> showdetails() {
		
		return studentrepo.findAll();
	}

	@Override
	public List<Result> showresult() {
		// TODO Auto-generated method stub
		return resultrepo.findAll();
	}

	@Override
	public List<Exam> viewexam() {
		// TODO Auto-generated method stub
		return examrepo.findAll();
	}

	@Override
	public String attemptexam(int id) {
		// TODO Auto-generated method stub
	
		return "Attempting the exam";
	}

	@Override
	public String adddetails(Student s) {
		studentrepo.save(s);
		return "Data addedd Successfully";
	}

 @Override
	public List<String> showStudentName() {
		
		return studentrepo.findName();
	}

}
