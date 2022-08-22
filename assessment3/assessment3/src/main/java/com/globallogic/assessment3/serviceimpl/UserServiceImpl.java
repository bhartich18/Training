package com.globallogic.assessment3.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment3.repository.UserRepo;
import com.globallogic.assessment3.service.UserService;


@Component
public class UserServiceImpl implements UserService{
@Autowired
UserRepo userrepo;



	@Override
	public String user(User s) {
		// TODO Auto-generated method stub
		userrepo.save(s);
		return "Data Added";
	}

	@Override
	public List<User> showdetails() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public String update(User s) {
		// TODO Auto-generated method stub
		userrepo.save(s);
		return "Data Updated";
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		userrepo.deleteById(id);
		return "Data Deleted";
	}

	@Override
	public String sucessSignin(long id, String email, String pass) {
		// TODO Auto-generated method stub
		List<Signup> sign = serv.showdet();
		for (Signup s : sign) {
			System.out.println("i am in for");
			System.out.println(s);
			if (s.getId() == id && s.getEmail().equals(email) && s.getPass().equals(pass)) {
				System.out.println("i am in if");
				return "Login Success";
			}
		}
		return "invalid login";
	}
	


	}

 