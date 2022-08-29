package com.globallogic.assessment4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.assessment4.entity.Exam;

@Service
public interface ExamService {
	public String adddetails(Exam e);
	public String updatedetails(Exam e);
	public String deletedetails(int id);
public List<Exam> alldetails();
}
