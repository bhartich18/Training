package com.globallogic.model;

public class Employee {
private int id;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private String email;
	private String address;
	private String phone;

	public Employee() {
	}
	public Employee(int id,String first_name, String last_name, String username, String password, String email, String address,
			String phone) {
	this(first_name,last_name,username,password,email,address,phone);
		this.id=id;
		
	}
	public Employee(String first_name, String last_name, String username, String password, String email, String address,
			String phone) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
