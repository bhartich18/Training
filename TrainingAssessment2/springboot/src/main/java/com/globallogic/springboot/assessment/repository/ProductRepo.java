package com.globallogic.springboot.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springboot.assessment.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
