package com.globallogic.assessment4.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment4.entity.Result;
import com.globallogic.assessment4.repo.ResultRepo;
import com.globallogic.assessment4.services.ResultService;
@Component
public class Resultserviceimpl implements ResultService{
@Autowired
ResultRepo resr;
	@Override
	public String adddetails(Result res) {
		resr.save(res);
		return "Result addedd Successfully";
	}

	@Override
	public String updatedetails(Result res) {
		resr.save(res);
		return "Result updated Successfully";
	}

	@Override
	public List<Result> alldetails() {
		// TODO Auto-generated method stub
		return resr.findAll();
	}


}
