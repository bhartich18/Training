package com.globallogic.assessment3.service;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.assessment3.entity.User;


@Component
public interface UserService {



public String user(User s);
public List<User> showdet();
public String update(User s);
public String delete(long id);
}