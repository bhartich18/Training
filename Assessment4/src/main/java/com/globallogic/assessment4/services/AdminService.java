package com.globallogic.assessment4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.assessment4.entity.Admin;
import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Student;

@Service
public interface AdminService {
	
	
public String adddetails(Admin ad);

public List<String> showName();
public List<Result> addResult();
public String addExam(Exam exam);
public String addStudent(Student s);
public List<Admin> alldetails();
}
