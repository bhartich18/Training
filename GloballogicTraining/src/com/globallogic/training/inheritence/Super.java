package com.globallogic.training.inheritence;

class P {
	int a;
	P(int a) {
		this.a = a;
	}
	void printP() {
		System.out.println("P: Base Class");
	}
}

class C extends P {
	C(int a) {
		super(a);
	}
	void printC() {
		System.out.println("C: Child Class");
	}
	void printParentMembers() {
		System.out.println("Parent Member(s): a= "+super.a);
	}
}

public class Super {
	public static void main(String[] args) {
		C c = new C(15);
		c.printC();
		c.printP();
		c.printParentMembers();
	}
}
