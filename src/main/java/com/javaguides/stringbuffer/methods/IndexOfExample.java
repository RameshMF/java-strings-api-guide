package com.javaguides.stringbuffer.methods;

public class IndexOfExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		
		// method 1
		int index = buffer.indexOf("guides");
		System.out.println(index);
		
		// method2
		index = buffer.indexOf("guides", 3);
		System.out.println(index);
	}
}
