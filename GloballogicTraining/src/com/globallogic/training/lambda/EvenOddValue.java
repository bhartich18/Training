package com.globallogic.training.lambda;



interface EvenOdd{
	
	public void check(int a);
		
}

public class EvenOddValue {
	public static void main(String[] args) {
		
		EvenOdd evenOdd=(a)->{
			  if(a%2==0){
				System.out.println("even number");
			  }else{
				System.out.println("Odd number");
			}
		};
		
		evenOdd.check(10);
		evenOdd.check(11);
	}

}