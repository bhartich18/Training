package com.globallogic.training.inheritence;

class BaseClass {
	void printBase() {
		System.out.println("Base Class");
	}
}

class ChildClass extends BaseClass {
	void printChild() {
		System.out.println("Child Class");
	}
}

public class Single {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.printChild();
		childClass.printBase();
	}
}
