package com.globallogic.assessment3.service;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.assessment3.entity.User;

@Component
public interface UserService {

public String signIn(long id,String email,String pass);
public String user(User username);
public List<User> showdetails();
public String update(User user);
public String delete(long id);
}