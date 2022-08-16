package com.globallogic.springboot.assessment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.springboot.assessment.entity.ProductEntity;
import com.globallogic.springboot.assessment.repository.CategoryRepo;
import com.globallogic.springboot.assessment.repository.MerchantRepo;
import com.globallogic.springboot.assessment.repository.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepo repo;

	@Autowired
	CategoryRepo categoryRepo;
	@Autowired
	MerchantRepo merRepo;

	@GetMapping("/")
	public List<ProductEntity> showDetails() {

		return ProductRepo.findAll();
	}

	// use the GET All the data
	@GetMapping("/prodList/{id}")
	public List<String> showProductByCategoryId(@PathVariable("id") int id) {

		List<ProductEntity> prod = ProductRepo.findAll();
		System.out.println(prod);

		List<ProductEntity> prodName = prod.stream().filter(e -> (e.getCategory().getId()) == id)
				.collect(Collectors.toList());

		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for (ProductEntity pro : prodName) {
			name.add(pro.getName());
		}
		return name;

	}

	@GetMapping("/prod/{name}")
	public List<String> showProductByCategoryName(@PathVariable("name") String cName) {

		List<ProductEntity> prod = ProductRepo.findAll();
		System.out.println(prod);

		List<ProductEntity> prodName = prod.stream().filter(e -> (e.getCategory().getName()).equalsIgnoreCase(cName))
				.collect(Collectors.toList());

		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for (ProductEntity pro : prodName) {
			name.add(pro.getName());
		}
		return name;
	}

	@PostMapping("/")
	public List<ProductEntity> addDetails(@RequestBody ProductEntity prod) {

		ProductRepo.save(prod);
		return ProductRepo.findAll();
	}

	@PutMapping("/")
	public List<ProductEntity> updateDetails(@RequestBody ProductEntity prod) {
		ProductRepo.save(prod);
		return ProductRepo.findAll();
	}

	// delete : it is used to delete the resource on the server
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.err.println("deleted id is : " + id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}

}
