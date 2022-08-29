package com.globallogic.assessment4.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.repo.ExamRepo;
import com.globallogic.assessment4.services.ExamService;
@Component
public class Examserviceimpl implements ExamService {
@Autowired
ExamRepo examrepo;
	@Override
	public String adddetails(Exam e) {
		examrepo.save(e);
		System.out.println(e);
		return "Exam details added Successfully";
	}

	@Override
	public String updatedetails(Exam e) {
		examrepo.save(e);
		return  "Exam details updated Successfully";
	}

	@Override
	public String deletedetails(int id) {
		// TODO Auto-generated method stub
		examrepo.deleteById(id);
		return " Exam details deleted Successfully";
	}

	@Override
	public List<Exam> alldetails() {
		// TODO Auto-generated method stub
		return examrepo.findAll();
	}

}
