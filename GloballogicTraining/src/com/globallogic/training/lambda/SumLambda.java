package com.globallogic.training.lambda;

interface Arithmetic{
	public int Sum(int n);
}

public class SumLambda {
	public static void main(String[] args) {
		Arithmetic sum=(n)->{
			int s=0;
			for(int i=1; i<=n;i++){
				s=s+i;
			}
			return s;
		};
		
		System.out.println(sum.Sum(100));
	}

}