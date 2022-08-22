package com.globallogic.assessment3.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.SignUp;
import com.globallogic.assessment3.entity.User;
import com.globallogic.assessment3.repository.UserRepo;
import com.globallogic.assessment3.service.UserService;


@Component
public class UserServiceImpl implements UserService{
@Autowired
UserRepo userrepo;



	@Override
	public String user(User str) {
		
		userrepo.save(str);
		return "Data Added";
	}

	@Override
	public List<User> showdetails() {
		
		return userrepo.findAll();
	}

	@Override
	public String update(User str) {
		
		userrepo.save(str);
		return "Data Updated";
	}

	@Override
	public String delete(long id) {
		
		userrepo.deleteById(id);
		return "Data Deleted";
	}

	@Override
	public String signIn(long id, String email, String pass) {
		
		List<SignUp> sign = service.showdetails();
		for (SignUp str : sign) {
			System.out.println("Login");
			System.out.println("str");
			if (str.getId() == id && str.getEmail().equals(email) && str.getPass().equals(pass)) {
				System.out.println("Not");
				return "Login Success";
			}
		}
		return "invalid login";
	}
	


	}

 