package com.javaguides.stringbuilder.methods;

public class ReplaceExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("jaguides");
		
		// replace ja with java- start index 0 and end index -1
		StringBuilder subBuilder = builder.replace(0, 2, "java");
		
		System.out.println(subBuilder);
	}
}
