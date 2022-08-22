package com.globallogic.assessment3.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.SignUp;

@Component
public interface SignUpService {
	
	
	public String signup(SignUp s);
	public List<SignUp> showdetails();
	public String update(SignUp s);
	public String delete(long id);

	}

