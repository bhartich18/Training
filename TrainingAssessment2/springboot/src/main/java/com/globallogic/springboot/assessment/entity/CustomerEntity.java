package com.globallogic.springboot.assessment.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	public CustomerEntity() {
		
	}

	public CustomerEntity(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column
	String name;
	
	@Column
	String location;

}

