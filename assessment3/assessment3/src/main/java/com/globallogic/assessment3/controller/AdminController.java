package com.globallogic.assessment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment3.entity.Admin;
import com.globallogic.assessment3.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService service;

	@Autowired

	@GetMapping("/")
	public List<Admin> details() {
		return service.showdetails();
	}

	@PostMapping("/")
	public String adddetails(@RequestBody Admin s) {
		return service.admin(s);
	}

	@PutMapping("/")
	public String updatedetails(@RequestBody Admin s) {
		return service.update(s);
	}

	@DeleteMapping("/{id}")

	public String deletedetails(@PathVariable("id") long id) {
		return service.delete(id);
	}

}
