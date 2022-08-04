package com.globallogic.training.wrapperclass;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		
		//String
		String a=new String("abc");
		String b=new String("abc");
		System.out.println("hash: "+(a.hashCode()==b.hashCode()));
		System.out.println("reference: "+(a==b));
		
		System.out.println("------------------------------------------------");
		
		//String Buffer
		StringBuffer sBuffer = new StringBuffer("abc");
		System.out.println(sBuffer.indexOf("b"));
		
		System.out.println("------------------------------------------------");
		
		//String Builder
		StringBuilder sBuilder = new StringBuilder("abc");
		System.out.println(sBuilder.append(false));
		System.out.println(sBuilder.reverse());
		
		System.out.println("------------------------------------------------");
		
		StringBuilder rFridge = new StringBuilder("Refrigerator");
		System.out.println("Length of "+rFridge+": "+rFridge.length());
		
		System.out.println("------------------------------------------------");
		
		String umbrella="Umbrella";
		boolean containsE = umbrella.indexOf('e')!=-1;
		System.out.println(umbrella+" contains letter e: "+containsE);
		
		System.out.println("------------------------------------------------");
		
		String orange="I love orange juice";
		boolean containsO = orange.contains("orange");
		System.out.println(orange+" contains the word orange: "+containsO);
		
		System.out.println("------------------------------------------------");
		
		String hello="Hello World";
		int indexO = hello.lastIndexOf('o');
		System.out.println("Last index of letter 'o' in "+hello+": "+indexO);
		
		System.out.println("------------------------------------------------");
		
		String word="level";
		boolean isPalin = true;
		for(int i=0 ; i<word.length() ; i++)
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				isPalin=false;
				break;
			}
		System.out.println(word+" is a palindrom: "+isPalin);
		
		System.out.println("------------------------------------------------");
		
		String original="A batman with bat";
		System.out.println(original.replace("bat","snow"));
		
		System.out.println("------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		System.out.println("Input given: "+scanner.nextLine());
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter: I love candies");
		String candies = scanner.nextLine();
		if(candies.equalsIgnoreCase("I love candies"))
			System.out.println("You entered: "+candies);
		else
			System.out.println("Wrong!!!");
	}
}
