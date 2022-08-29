package com.globallogic.assessment4.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.stereotype.Component;

import com.globallogic.assessment4.entity.Exam;
import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.entity.Staff;
import com.globallogic.assessment4.entity.Student;
import com.globallogic.assessment4.repo.StaffRepo;
import com.globallogic.assessment4.services.ExamService;
import com.globallogic.assessment4.services.ResultService;
import com.globallogic.assessment4.services.StaffService;
import com.globallogic.assessment4.services.StudentService;
@Component
public class Staffserviceimpl implements StaffService {


@Autowired
StaffRepo staffrepo;

@Autowired
StudentService studentrepo;

@Autowired
ExamService examrepo;

@Autowired
ResultService resultservice;




	@Override
	public String adddetails(Staff s) {
		staffrepo.adddetails(s);
		return "Data Added Sucessfully" ;
	}

	@Override
	public List<String> showName() {
		
		return staffrepo.showStudentName();
	}


	@Override
	public String updatedetails(Staff s) {
		staffrepo.save(s);
		return  "Data Updated Sucessfully" ;
	}

	@Override
	public List<Student> showStudent(String name) {
		
		return staffrepo.showStudent();
	}

	@Override
	public String addResult(Result res) {
		resultservice.adddetails(res);
		return "Data of Result is added" ;
	}

	@Override
	public String addExam(Exam exam) {
		examrepo.adddetails(exam);
		return "Data of Exam is added";
	}

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub\
		studentrepo.adddetails(s);
		return "Data of Sudent is added";
	}

	@Override
	public List<Staff> alldetails(AlldetailsParameter parameterObject) {
		// TODO Auto-generated method stub
		return staffrepo.findAll();
	}

}
