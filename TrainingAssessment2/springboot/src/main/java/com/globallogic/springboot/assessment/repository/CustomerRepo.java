package com.globallogic.springboot.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springboot.assessment.entity.CustomerEntity;

public interface CustomerRepo  extends JpaRepository<CustomerEntity, Integer>{

}

