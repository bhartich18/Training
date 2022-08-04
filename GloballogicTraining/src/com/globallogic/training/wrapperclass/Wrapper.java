package com.globallogic.training.wrapperclass;

public class Wrapper {
	public static void main(String[] args) {
		Integer i = Integer.MAX_VALUE;
		System.out.println("Integer number: "+i);
		String s = Integer.toString(i);
		System.out.println("String value of the number: "+s);
		char zeroPlace = s.charAt(s.length()-1);
		System.out.println("Last digit of number: "+zeroPlace);
		zeroPlace += 1;
		System.out.println("Incremented last digit of number: "+zeroPlace);
		s=s.substring(0,s.length()-1);
		s= s+zeroPlace;
		System.out.println("String value of incremented number: "+s);
		long l = Long.parseLong(s);
		System.out.println("Incremented number to long: "+l);
		System.out.println(Long.compare((long)i+2, l));
	}
}