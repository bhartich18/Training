package com.globallogic.training.inheritence;

class Parent {
	void printParent() {
		System.out.println("Parent Class");
	}
}

class Child1 extends Parent {
	void printChild() {
		System.out.println("Child1 Class");
	}
}

class Child2 extends Parent {
	void printChild() {
		System.out.println("Child2 Class");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.printChild();
		child1.printParent();
		Child2 child2 = new Child2();
		child2.printChild();
		child2.printParent();
	}
}