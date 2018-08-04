package com.javaguides.stringbuilder.methods;

public class IndexOfExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		
		// method 1
		int index = builder.indexOf("guides");
		System.out.println(index);
		
		// method2
		index = builder.indexOf("guides", 3);
		System.out.println(index);
	}
}
