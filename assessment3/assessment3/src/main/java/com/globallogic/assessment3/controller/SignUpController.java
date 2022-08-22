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



@RestController
@RequestMapping("/signin")
public class SignUpController {
	@Autowired
	SignUpServive service;

	@GetMapping("/")
	public List<Signup> details() {
		return service.showdet();
	}

	@PostMapping("/")
	public String adddetails(@RequestBody Signup s) {
		return service.signin(s);
	}

	@PutMapping("/")
	public String updatedetails(@RequestBody Signup s) {
		return service.update(s);
	}

	@DeleteMapping("/{id}")

	public String deletedetails(@PathVariable("id") long id) {
		return service.delete(id);
	}
}
