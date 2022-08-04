package com.globallogic.training.wrapperclass;

public class ReplacePlain {
	public static void main(String[] args) {

		
		String str="bob is on sea level";
		String S="";
		String w="";
		System.out.println("Sentence: "+str);
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' '){
				S=S+isPlain(w)+str.charAt(i);
				w="";
			}
			else {
				w=w+str.charAt(i);
			}
		S=S+isPlain(w);
		System.out.println(S);
	}
	public static String isPlain(String word) {
		boolean b=true;
		for(int i=0 ; i<word.length() ; i++)
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				b=false;
				break;
			}
		if(b){
			int l=word.length();
			word="";
			while(l-->0)
				word=word+'*';
		}
		return word;
	}
}
