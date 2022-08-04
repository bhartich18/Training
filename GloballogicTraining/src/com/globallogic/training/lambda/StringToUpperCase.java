package com.globallogic.training.lambda;


interface ToUpperCase{
	public  void upperCase(String s);
}

public class StringToUpperCase {
	public static void main(String[] args) {
		ToUpperCase toUpperCase =(s)->{
			System.out.println(s.toUpperCase());
			
		};
		
		toUpperCase.upperCase("sakshi");
	}
}