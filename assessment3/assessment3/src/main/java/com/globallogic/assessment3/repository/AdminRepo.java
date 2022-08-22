package com.globallogic.assessment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.assessment3.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{
}
