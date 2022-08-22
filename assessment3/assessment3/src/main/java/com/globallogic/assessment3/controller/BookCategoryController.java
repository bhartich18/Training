package com.globallogic.assessment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.assessment3.entity.BookCategory;
import com.globallogic.assessment3.repository.BookCategoryRepo;
import com.globallogic.assessment3.service.CategoryService;

@RestController
@RequestMapping("/category")
public class BookCategoryController {
	@Autowired
	CategoryService categoryService;
	
	//GET requests
	
	//GET request for fetching all Category
	@GetMapping
	public List<BookCategory> getAllCategorys(){
		return categoryService.getAllCategorys();
	}
	
	//GET request for fetching a Category by ID
	@GetMapping("/{id}")
	public BookCategory getCategoryById(@PathVariable int id) throws Exception {
		return categoryService.getCategoryById(id);
	}
	
	
	//POST requests
	
	//POST request to add a Category
	@PostMapping
	public BookCategory addCategory( @RequestBody BookCategory category) {
		return categoryService.addCategory(category);
	}
	
	
	//DELETE requests
	
	//DELETE request to delete a Category by id
	@DeleteMapping("/{id}")
	public String deleteCategoryById(@PathVariable int id) {
		return categoryService.deleteCategoryById(id);
	}
	
	//PUT requests
	
	//PUT request to update a Category
	//If any field is missing, it will take default value for the respective field
	@PutMapping
	public BookCategory updateCategory(@RequestBody BookCategory category) {
		return categoryService.updateCategory(category);
	}
	
	//PUT request to update a Category by id
	//If any field is missing, it will take default value for the respective field
	@PutMapping("/{id}")
	public BookCategory updateCategoryById(@RequestBody BookCategory changes,@PathVariable int id) throws Exception {
		return categoryService.updateCategoryById(changes,id);
	}
}