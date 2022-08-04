package com.globallogic.training.encapsulation;

public class Encapsulation {
	public static void main(String[] args) {
		Person p = new Person("Aman", 25);
		System.out.println(p.toString());
		p.setAge(21);
		System.out.println("Age of "+p.getName()+": "+p.getAge());
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

