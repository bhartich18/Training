package com.globallogic.assessment3.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.Book;
import com.globallogic.assessment3.repository.BookRepo;



@Component
public class BookServiceImpl  implements BookService {
@Autowired
BookRepo bookrepo;
	@Override
	public String add(Book book) {
		
		bookrepo.save(book);
		return "Data added successfully";
	}
@Override
	public List<Book> display() {
		
		return bookrepo.findAll();
		}
@Override
public String update(Book book) {

	bookrepo.save(book);
	return "Data Updated";
}
@Override
public String delete(long id) {

	bookrepo.deleteById(id);
	return "Data deleted";
}
}

