package com.globallogic.springboot.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springboot.assessment.entity.CategoryEntity;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer>{

}
