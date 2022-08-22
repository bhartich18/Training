package com.globallogic.assessment3.serviceimpl;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.Admin;
import com.globallogic.assessment3.repository.AdminRepo;
import com.globallogic.assessment3.service.AdminService;


	

	@Component
	public class AdminServiceImpl  implements AdminService {
		@Autowired
		AdminRepo repo;
//		@Autowired
		

		@Override
		public String admin(Admin s) {
			repo.save(s);
			return "Data Admin Added";
		}

		@Override
		public List<Admin> showdetails() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}

		@Override
		public String update(Admin s) {
			// TODO Auto-generated method stub
			repo.save(s);
			return "Data Admin updated";
		}

		@Override
		public String delete(long id) {
			// TODO Auto-generated method stub
			repo.deleteById(id);
			return "Data deleted of admin";
		}

		@Override
		public String sucessSignin(long id, String email, String pass) {
			// TODO Auto-generated method stub
			return null;
		}


		}

