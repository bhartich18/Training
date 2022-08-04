package com.globallogic.training.JavaCollections;

 public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	public Employee() {
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}
	public boolean isSame(Employee e) {
		if(this.name.equalsIgnoreCase(e.name) && this.salary==e.salary)
			return true;
		return false;
	}
}
