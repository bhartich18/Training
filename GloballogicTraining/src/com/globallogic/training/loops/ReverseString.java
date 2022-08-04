package com.globallogic.training.loops;

//Java Program to reverse the letters present in the given String
public class ReverseString {
	public static void main(String[] args) {
		String s="GlobalLogic";

		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}

	}
}