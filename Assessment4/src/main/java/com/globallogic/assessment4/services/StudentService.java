package com.globallogic.assessment4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Student;

@Service
public interface StudentService {
public List<Student>showdetails();
public List<Result> showresult();
public List<Exam> viewexam();
public String attemptexam(int id);
public String adddetails(Student s);
public List<String> showStudentName();
}
