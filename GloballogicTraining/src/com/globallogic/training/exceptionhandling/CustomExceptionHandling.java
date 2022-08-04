package com.globallogic.training.exceptionhandling;

class AgeNotValidException extends Exception{
	public AgeNotValidException(String str) {
		super(str);
	}
}

public class CustomExceptionHandling {
	
	static void canVote(int age) throws AgeNotValidException {
		if(age<18)
			throw new AgeNotValidException("Age should be 18 or above");
		else
			System.out.println(age+" is a valid age to vote");
	}
	
	public static void main(String[] args) {
		try {
			canVote(25);
			canVote(5);
		} catch(AgeNotValidException e) {
			System.out.println(e);
		}
	}
}