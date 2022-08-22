package com.globallogic.assessment3.service;




import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.assessment3.entity.Admin;


@Component
public interface AdminService {

	public String admin (Admin s);
	public List<Admin> showdetails();
	public String update(Admin s);
	public String delete(long id);
	public String sucessSignin(long id,String email,String pass);
}