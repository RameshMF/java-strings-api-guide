package com.javaguides.stringbuilder.methods;

public class LastIndexOfExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");

		// method1
		int lastIndexOf = builder.lastIndexOf("guides");
		System.out.println(" last index of given string 'guides' in' "
		  + builder.toString() + "' ::  " + lastIndexOf);

		// method 2
		lastIndexOf = builder.lastIndexOf("java", 3);
		System.out.println(" last index of given string 'java' in' "
		   + builder.toString() + "' ::  " + lastIndexOf);
	}
}
