package com.globallogic.assessment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.assessment3.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	}


