package com.globallogic.training.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {1,3,5,3,6,3,63,4,62};
		int element = 10;
		int position = serachSeq(element,a);
		if(position==-1)
			System.out.println(element+" is not present!");
		else
			System.out.println(element+" is present: "+position);
	}

	private static int serachSeq(int element, int[] a) {
		int i=0;
		while(i<a.length)
			if(a[i++] == element)
				return i;
		return -1;
	}
}