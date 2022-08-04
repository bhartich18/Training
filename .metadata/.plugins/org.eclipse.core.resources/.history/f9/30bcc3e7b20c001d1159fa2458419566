package com.globallogic.training.lambda;

@FunctionalInterface
interface Greater{
	int greater(int a, int b);
}
@FunctionalInterface
interface Smaller{
	int smaller(int a, int b);
}
@FunctionalInterface
interface OddOrEven{
	String oddOrEven(int a);
}
@FunctionalInterface
interface Print{
	void print(String s);
}
@FunctionalInterface
interface SumOfNaturalNumbers{
	int sumOfNaturalNumbers(int a);
}

public class Lambda {
	public static void main(String[] args) {
		Greater greaterObj = (a,b) -> a>b?a:b;
		Smaller smallerObj = (a,b) -> a<b?a:b;
		OddOrEven oddOrEvenObj = (a) -> a%2==0?"Even":"Odd";
		Print printObj = (s) ->System.out.println(s);
		SumOfNaturalNumbers sumOfNaturalNumbersObj = (n) -> {
			int sum=0;
			while(n>0) sum+=n--;
			return sum;
		};
		System.out.println("Odd or Even: "+oddOrEvenObj.oddOrEven(57));
		System.out.println("Greater: "+greaterObj.greater(10,57));
		System.out.println("Smaller: "+smallerObj.smaller(10,57));
		printObj.print("Hello World");
		System.out.println("Sum of 100: "+sumOfNaturalNumbersObj.sumOfNaturalNumbers(100));
	}
}
