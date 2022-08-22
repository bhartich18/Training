package com.globallogic.assessment3.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.SignUp;
import com.globallogic.assessment3.repository.SignUpRepo;
import com.globallogic.assessment3.service.SignUpService;

@Component
public class SignUpServiceImpl implements SignUpService{
@Autowired
SignUpRepo srepo;

@Override
public String signup(SignUp str) {
	// TODO Auto-generated method stub
	srepo.save(str);
	return "Signed Up Successfully";
}

@Override
public List<SignUp> showdetails() {
	// TODO Auto-generated method stub
	return srepo.findAll();
}

@Override
public String update(SignUp str) {
	// TODO Auto-generated method stub
	srepo.save(str);
	return "Updated Successfully";
}

@Override
public String delete(long id) {
	// TODO Auto-generated method stub
	srepo.deleteById(id);
	return "Deleted Successfully";
}
	
}
