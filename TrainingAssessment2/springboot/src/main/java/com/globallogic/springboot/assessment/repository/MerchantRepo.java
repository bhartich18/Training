package com.globallogic.springboot.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springboot.assessment.entity.MerchantEntity;

public interface MerchantRepo  extends JpaRepository<MerchantEntity, Integer>{

}
