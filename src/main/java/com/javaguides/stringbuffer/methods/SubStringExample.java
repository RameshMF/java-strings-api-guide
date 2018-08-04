package com.javaguides.stringbuffer.methods;

public class SubStringExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		
		// substring from start to end
		String subStr = buffer.substring(0, buffer.length());
		System.out.println("substring from 0 to length of the string : " + subStr);
		
		// print java
		System.out.println(buffer.substring(0, 4));
		
		// print guides
		System.out.println(buffer.substring(4, buffer.length()));
	}
}
