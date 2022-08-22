package com.globallogic.assessment3.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.assessment3.entity.Book;
import com.globallogic.assessment3.repository.BookRepo;



@Component
public class BookServiceImpl  implements BookService {
@Autowired
BookRepo br;
	@Override
	public String addbook(Book bk) {
		
		br.save(bk);
		return "Data added successfully";
	}
@Override
	public List<Book> display() {
		
		return br.findAll();
		}
@Override
public String update(Book s) {

	br.save(s);
	return "Data Updated";
}
@Override
public String delete(long id) {

	br.deleteById(id);
	return "Data deleted";
}
}

