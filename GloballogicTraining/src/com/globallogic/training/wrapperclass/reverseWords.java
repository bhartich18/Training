package com.globallogic.training.wrapperclass;

public class reverseWords {
	public static void main(String[] args) {
		String str=".www.goo,gle.com"+'\t'+"zd";
		String S="";
		String w="";
		System.out.println("Sentence: "+str);
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ' || str.charAt(i)=='.' || str.charAt(i)=='\t' || str.charAt(i)==','){
				S=S+w+str.charAt(i);
				w="";
			} else
				w=str.charAt(i)+w;
		S=S+w;
		System.out.println("Sentence with reversed words: "+S);
	}
}
