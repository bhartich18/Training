package com.globallogic.training.Swapping;

//Java program for swapping two numbers
public class SwapNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("Before swap:");
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swap:");
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
	}
}