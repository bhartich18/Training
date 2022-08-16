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

	public ProductEntity(int id, String name, String color, int price) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
	

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public MerchantEntity getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantEntity merchant) {
		this.merchant = merchant;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
    String name;
	
	@Column
	String color;
	
	@Column
	int price;
	
	@OneToOne(cascade = CascadeType.ALL)
	CategoryEntity category;
	
	@OneToOne(cascade = CascadeType.ALL)
	MerchantEntity merchant;

}
