package com.globallogic.training.inheritence;

class ClassParent {
	void printParent() {
		System.out.println("Parent Class");
	}
}

class ClassMiddle extends ClassParent {
	void printMiddle() {
		System.out.println("Middle Class");
	}
}

class ClassChild extends ClassMiddle {
	void printChild() {
		System.out.println("Child Class");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		ClassChild classChild = new ClassChild();
		classChild.printChild();
		classChild.printMiddle();
		classChild.printParent();
	}
}
