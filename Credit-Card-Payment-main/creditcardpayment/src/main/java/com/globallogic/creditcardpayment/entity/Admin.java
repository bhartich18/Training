package com.globallogic.creditcardpayment.entity;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	User user;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(long id, User user) {
		super();
		this.id = id;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", user=" + user + "]";
	}


}