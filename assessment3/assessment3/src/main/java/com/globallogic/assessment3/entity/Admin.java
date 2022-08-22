package com.globallogic.assessment3.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Admin")
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
long id;
@Column
String name; 
@Column
long phone;
@ManyToMany(cascade=CascadeType.PERSIST)
List<Book> list;


public Admin(long id, String name, long phone, List<Book> list) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.list = list;
	
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
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
public List<Book> getList() {
	return list;
}
public void setUs(List<Book> list) {
	this.list = list;
}


@Override
public String toString() {
	return "admin [id=" + id + ", name=" + name + ", phone=" + phone + ", us=" + list + ", ]";
}

}
