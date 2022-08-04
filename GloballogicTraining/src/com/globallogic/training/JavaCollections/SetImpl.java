package com.globallogic.training.JavaCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class SetImpl {
	static SetImpl<Employee> hashSet = new HashSet<>();
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		
		System.out.println("1- Add Employee");
		System.out.println("2- Remove Employee");
		System.out.println("3- Search Employee");
		System.out.println("4- Sort List");
		System.out.println("5- Display");
		System.out.println("6- Exit");
		boolean loop=true;
		while(loop) {
			String name;
			int salary;
			System.out.println("Enter 1,2,3,4,5 or 6");
			int choice = Integer.parseInt(BR.readLine());
			switch(choice) {
				case 1:
					System.out.println("Enter name");
					name=BR.readLine();
					System.out.println("Enter salary");
					salary = Integer.parseInt(BR.readLine());
					add(name,salary);
					break;
				case 2:
					if(hashSet==null || hashSet.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter the name");
					name=BR.readLine();
					System.out.println("Enter salary");
					salary = Integer.parseInt(BR.readLine());
					remove(name,salary);
					break;
				case 3:
					if(hashSet==null || hashSet.size()==0) {
						System.out.println("No Employees");
						break;
					}
					System.out.println("Enter the name");
					name=BR.readLine();
					System.out.println("Enter salary");
					salary = Integer.parseInt(BR.readLine());
					search(name,salary);
					break;
				case 4:
					if(hashSet==null || hashSet.size()==0) {
						System.out.println("No Employees");
						break;
					}
					sort();
					break;
				case 5:
					if(hashSet==null || hashSet.size()==0) {
						System.out.println("No Employees");
						break;
					}
					display();
					break;
				case 6:
					loop=false;
					System.out.println("Exiting....");
					break;
				default:
					System.out.println("Wrong input! Try again.");
			}
		}
		System.out.println("Exitied program.");
	}
	private static void display() {
		Iterator<Employee> it= hashSet.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	private static void sort() {
		display();
		List<Employee> list= new ArrayList<>();
		Iterator<Employee> it= hashSet.iterator();
		while(it.hasNext())
			list.add(it.next());
		Collections.sort(list,(a,b)-> a.getName().compareTo(b.getName()));
		for(Employee e: list)
			hashSet.add(e);
		list.clear();
		display();
	}
	private static void search(String name, int salary) {
		Employee newE = new Employee(name,salary);
		Iterator<Employee> it= hashSet.iterator();
		boolean hasE=false;
		while(it.hasNext())
			if(it.next().isSame(newE)) {
				System.out.println("Employee is present");
				break;
			}
		if(!hasE)
			System.out.println("Employee is present");
	}
		
	private static void remove(String name, int salary) {
		Employee newE = new Employee(name,salary);
		Iterator<Employee> it= hashSet.iterator();
		boolean hasE=false;
		Employee e;
		while(it.hasNext()) {
			e=it.next();
			if(e.isSame(newE)) {
				hasE=true;
				hashSet.remove(e);
				break;
			}
		}
		if(hasE)
			System.out.println("Removed: "+newE);
		else
			System.out.println("Employee does not Exisit!!!");
	}
	private static void add(String name, int salary) {
		Employee newE = new Employee(name.toUpperCase(),salary);
		Iterator<Employee> it= hashSet.iterator();
		boolean hasE=false;
		Employee e;
		while(it.hasNext()) {
			e=it.next();
			if(e.isSame(newE)) {
				hasE=true;
				break;
			}
		}
		if(hasE)
			System.out.println("Employee already exists");
		else {
			hashSet.add(newE);
			System.out.println("Added: "+newE);
		}
	}
}
