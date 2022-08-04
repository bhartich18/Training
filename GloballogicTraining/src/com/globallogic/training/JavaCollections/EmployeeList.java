package com.globallogic.training.JavaCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameSortComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
	

public class EmployeeList {
	static ArrayList<Employee> list = new ArrayList<>();
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		System.out.println("1- Add Employee");
		System.out.println("2- Delete Employee by index");
		System.out.println("3- Delete Employee by name");
		System.out.println("4- Search Employee");
		System.out.println("5- Update Employee");
		System.out.println("6- Sort List");
		System.out.println("7- Sum of salaries of all employees");
		System.out.println("8- Highest Salary");
		System.out.println("9- Lowest Salary");
		System.out.println("10- Exit");
		boolean loop=true;
		while(loop) {
			System.out.println("Enter 1,2,3,4,5,6,7,8 or 9");
			int choice = Integer.parseInt(BR.readLine());
			switch(choice) {
				case 1:
					System.out.println("Enter name");
					String name=BR.readLine();
					System.out.println("Enter salary");
					int salary = Integer.parseInt(BR.readLine());
					add(name,salary);
					break;
				case 2:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter the index");
					int index=Integer.parseInt(BR.readLine());
					delete(index);
					break;
				case 3:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter the name");
					String s=BR.readLine();
					delete(s);
					break;
				case 4:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter name");
					String key=BR.readLine();
					search(key);
					break;
				case 5:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter index");
					int i=Integer.parseInt(BR.readLine());
					update(i);
					break;
				case 6:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					sort();
					break;
				case 7:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Sum of salaries: "+getSum());
					break;
				case 8:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Highest salary: "+getHighestSalary());
					break;
				case 9:
					if(list==null || list.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Lowest salary: "+getLowestSalary());
					break;
				case 10:
					loop=false;
					System.out.println("Exiting....");
					break;
				default:
					System.out.println("Wrong input! Try again.");
			}
		}
		System.out.println("Exitied program.");
	}

	private static int getLowestSalary() {
		int low=Integer.MAX_VALUE;
		for(Employee e: list)
			low=Math.min(low,e.getSalary());
		return low;
	}

	private static int getHighestSalary() {
		int high=Integer.MIN_VALUE;
		for(Employee e: list)
			high=Math.max(high,e.getSalary());
		return high;
	}

	private static int getSum() {
		int sum=0;
		for(Employee e: list)
			sum+=e.getSalary();
		return sum;
	}

	private static void update(int index)throws IOException {
		if(index<list.size()) {
			Employee e =list.get(index);
			System.out.println("Enter name");
			String name=BR.readLine();
			System.out.println("Enter salary");
			int salary = Integer.parseInt(BR.readLine());
			e.setName(name);
			e.setSalary(salary);
		}
		else
			System.out.println("Enter any whole number below "+list.size());
	}

	private static void sort() {
		
		//Use any of the 4 methods
		
		//Method 1
		//Without creating custom Comparator in separate class
		//Using lambda function
		Collections.sort(list,(a,b)->a.name.compareTo(b.name));
		
		//Method 2
		//Using Comparable in model class
		//Using lambda function
		Collections.sort(list,(a,b)->a.compareTo(b));
		
		//Method 3
		//Using custom Comparator outer class within the java file
		//NameSortComparator class is at the top in this java file
		Collections.sort(list, new NameSortComparator());
		
		//Method 4
		//Using custom Comparator within sort function
		Collections.sort(list, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		displayList();
		
	}

	private static int search(String key) {
		int i = 0;
		while(i<list.size()) {
			if(list.get(i).getName().equalsIgnoreCase(key)) {
				System.out.println(key+" is present at index "+i);
				System.out.println(list.get(i));
				return i;
			}
			i++;
		}
		System.out.println(key+" is not present");
		return -1;
	}

	private static void delete(String name) {
		int index = search(name);
		if(index!=-1)
			delete(index);
	}

	private static void delete(int index) {
		if(index<list.size()) {
			System.out.println("Deleted: "+list.get(index));
			list.remove(index);
		}
		else
			System.out.println("Enter any whole number below "+list.size());
	}

	private static void add(String name, int salary){
		list.add(new Employee(name,salary));
	}
	
	private static void displayList() {
		for(Employee e: list)
			System.out.println(e);
	}
	
}
