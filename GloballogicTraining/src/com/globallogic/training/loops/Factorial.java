
package com.globallogic.training.loops;

//Java program to calculate a Factorial of a number
public class Factorial {
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		while(n>1) {
			fact *= n--;
		}
		System.out.println(fact);
	}
}