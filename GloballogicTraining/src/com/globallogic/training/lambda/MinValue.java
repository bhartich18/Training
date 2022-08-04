package com.globallogic.training.lambda;

interface Min{
	public void minVal(int a,int b);
}

public class MinValue {
	public static void main(String[] args) {
		Min min=(a,b)->{
			if(a<b){
				System.out.println("Min value"+a);
			}else{
				System.out.println("Min Value"+b);
			}
		};
		
		min.minVal(1, 7);
		min.minVal(12, 15);
		
	}

}