package com.globallogic.creditcardpayment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.creditcardpayment.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
