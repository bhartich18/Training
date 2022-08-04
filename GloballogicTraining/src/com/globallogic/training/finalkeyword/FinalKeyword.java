package com.globallogic.training.finalkeyword;

class Car{
	private String name;
	private String company;
	private double price;
	final static int wheels=4;
	public Car(String name, String company, double price) {
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWheels() {
		return wheels;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", company=" + company + ", price= INR " + price + "]";
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		final Car alto = new Car("Alto","Suzuki",400000.00);
		final Car harrier = new Car("Harrier","Tata",2000000.00);
		System.out.println(alto.toString());
		System.out.println(harrier.toString());
		if(Car.wheels==harrier.getWheels())
			System.out.println(harrier.getName()+ " is a Car");
		else
			System.out.println(harrier.getName()+ " is not a Car");
	}
}
