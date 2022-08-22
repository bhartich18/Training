package com.globallogic.assessment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.assessment3.entity.Book;



	public interface BookRepo extends JpaRepository<Book, Integer>{
		
	}


