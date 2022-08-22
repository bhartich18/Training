package com.globallogic.assessment3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment3.entity.Book;
import com.globallogic.assessment3.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService bs;


	@GetMapping("/")
	public List<Book> disbook()
	{
		return bs.display();
	}

	@PostMapping("/")
	public String addbook(@RequestBody Book e)
	{
		return bs.addbook(e);
	}
	@PutMapping("/{id}")
	public void editbook(@PathVariable("id")long id) {
		
	}
}