package com.globallogic.training.lambda;

interface LargestVal{
	  public  void largestval(int a,int b);
}

public class LargestValue {
	public static void main(String[] args) {
		
		LargestVal largeval=(a,b)->{
			if(a>b){
				System.out.println("Largest value"+a);
			}else if(a==b){
				System.out.println("Equal values");
			}else{
				System.out.println("Largest value"+ b);
				
			}
		};
		
		largeval.largestval(12, 67);
		largeval.largestval(10, 7);
		largeval.largestval(10, 10);
		
	}

}
