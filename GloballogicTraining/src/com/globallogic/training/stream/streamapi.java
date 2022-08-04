package com.globallogic.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.globallogic.training.JavaCollections.Employee;

public class streamapi {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Bharti", 5000));
		list.add(new Employee("Chahal", 2000));
		list.add(new Employee("Minku", 2000));
		list.add(new Employee("Muskan", 2500));
		list.add(new Employee("Hey", 3900));
		System.out.println("Employees:");
		System.out.println("------------------------------------");
		list.stream().forEach(System.out::println);
		List<Employee> collectedEmpList = (List<Employee>) list.stream()
				.filter(e -> e.getSalary() >= 2500)
				.sorted((a,b)->a.compareTo(b))
				.collect(Collectors.toList());
		System.out.println();
		System.out.println("Employees with salary 2500 or above \n(in sorted order of thier name):");
		System.out.println("------------------------------------");
		for(Employee e: collectedEmpList)
			System.out.println(e);
	}
}