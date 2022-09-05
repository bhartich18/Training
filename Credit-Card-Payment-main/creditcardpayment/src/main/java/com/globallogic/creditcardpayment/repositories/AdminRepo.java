package com.globallogic.creditcardpayment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.creditcardpayment.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

}
