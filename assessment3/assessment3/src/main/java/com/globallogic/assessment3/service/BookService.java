package com.globallogic.assessment3.service;


import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.assessment3.entity.Book;



@Component
public interface BookService {

public String add(Book book);
public List<Book>display();
public String update(Book book);
public String delete(long id);

}
