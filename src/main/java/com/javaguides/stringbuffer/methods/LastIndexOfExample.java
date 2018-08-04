package com.javaguides.stringbuffer.methods;

public class LastIndexOfExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		
		// method1
		int lastIndexOf = buffer.lastIndexOf("guides");
		System.out.println(" last index of given string 'guides' in' "
		    + buffer.toString()+"' ::  " + lastIndexOf);
		
		// method 2
		lastIndexOf = buffer.lastIndexOf("java", 3);
		System.out.println(" last index of given string 'java' in' "
		    + buffer.toString()+"' ::  " + lastIndexOf);
	}
}
