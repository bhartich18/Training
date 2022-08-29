package com.globallogic.assessment4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Staff;
import com.globallogic.assessment4.entity.Student;

@Service
public interface StaffService {
public String adddet(Staff s);

public String updatedetails(Staff s);
public List<Student> showStudent(String name);
public String addResult(Result res) ;
public String addExam(Exam exam);
public String adddetails(Student s);
public List<Staff> alldetails();
public List<String> showName();
}
