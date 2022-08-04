package com.globallogic.training.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Students {
	String name;
	int rollNo;
	public Students(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
}

public class Arraylist {
	public static void main(String[] args) {
		
		//ArrayList with no specific datatype
		ArrayList nonGenericList = new ArrayList();
		
		//Adding items to the Arraylist
		nonGenericList.add('@');
		nonGenericList.add("abc");
		nonGenericList.add(false);
		nonGenericList.add(3.68);
		nonGenericList.add(4567);

		//Printing with forEach method
		nonGenericList.forEach(System.out::println);
		
		//Removing item at index 2
		nonGenericList.remove(2);
		
		//Printing with advanced for-loop
		for(Object object: nonGenericList)
			System.out.print(object+" ");
		System.out.println();
		
		//Clearing the ArrayList
		nonGenericList.clear();
		
		//Printing the ArrayList object with default toString method
		System.out.println(nonGenericList);

		//creating ArrayList of specific datatype: integer
		ArrayList<Integer> genericList = new ArrayList<>();
		genericList.add(5);
		genericList.add(3);
		genericList.add(10);
		genericList.add(-2);
		genericList.add(4);
		
		//Printing the list
		System.out.println(genericList);
		
		//Sorting in ascending order
		Collections.sort(genericList);
		
		//Printing with forEach method
		genericList.forEach(item ->System.out.print(item+" "));
		System.out.println();
		
		//Sorting in reverse order
		Collections.sort(genericList,Collections.reverseOrder());
		
		//Printing the ArrayList that is reversed
		System.out.println(genericList);
		System.out.println();
		//List of Student
		ArrayList<Students> java4 = new ArrayList<>();
		java4.add(new Students("Agam", 3));
		java4.add(new Students("Aakriti", 1));
		java4.add(new Students("Aishwarya", 4));
		java4.add(new Students("Abhishek", 2));
		java4.add(new Students("Saurabh",100));
		for(Students student: java4)
			System.out.println(student);
		System.out.println();
		System.out.println("Updating last element");
		java4.set(java4.size()-1, new Students("Singh",99));
		for(Students student: java4)
			System.out.println(student);
		System.out.println();
		System.out.println("Removing last element");
		System.out.println("Adding more element");
		System.out.println("Sorting");
		java4.remove(java4.size()-1);
		java4.add(new Students("Akash K", 5));
		java4.add(new Students("Akash P", 6));
		java4.add(new Students("Akshay", 7));
		java4.add(new Students("Amerendra", 8));
		java4.add(new Students("Ashutosh", 9));
		java4.add(new Students("Bharti", 10));
		//Using comparator to sort objects in a list
		Collections.sort(java4,(a,b)->a.rollNo-b.rollNo);
		for(Students student: java4)
			System.out.println(student);
		
		
		
		
		
	}
}