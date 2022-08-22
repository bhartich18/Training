package com.globallogic.assessment3.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;



@Entity
@Table(name="User")

public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
long id;
	@Column
String name;
	@Column
long phone;
	@Column
String address;

@OneToMany(cascade=CascadeType.PERSIST)
List<Book> book;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String name, long phone, String address, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		book = book;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", Book=" + book
				+ "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		book = book;
	}
	
	
}