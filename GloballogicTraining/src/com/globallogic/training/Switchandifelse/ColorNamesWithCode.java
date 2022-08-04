package com.globallogic.training.Switchandifelse;

//write a program to give the color code and print the color name  //switch and if else ladders
public class ColorNamesWithCode {
	public static void main(String[] args) {
		
		
		int code =  3;
		
		//if else
		if(code==1)
			System.out.println("White");
		else if(code==2)
			System.out.println("Maroon");
		else if(code==3)
			System.out.println("Red");
		else if(code==4)
			System.out.println("Purple");
		else
			System.out.println("Couldn't find the color");
		
		//switch case
		switch(code) {
		case 1:
			System.out.println("White");
			break;
		case 2:
			System.out.println("Maroon");
			break;
		case 3:
			System.out.println("Red");
			break;
		case 4:
			System.out.println("Purple");
			break;
		default:
			System.out.println("Couldn't find the color");
		}
	}
}