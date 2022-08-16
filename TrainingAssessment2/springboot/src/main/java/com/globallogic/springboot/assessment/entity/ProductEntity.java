package com.globallogic.springboot.assessment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class ProductEntity {
	
	public ProductEntity() {
		
	}

	public ProductEntity(int id, CategoryEntity name, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoryEntity getName() {
		return name;
	}

	public void setName(CategoryEntity name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne()
    CategoryEntity name;
	
	@Column
	String color;
	
	@Column
	int price;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	CategoryEntity category;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	MerchantEntity merchant;

}
