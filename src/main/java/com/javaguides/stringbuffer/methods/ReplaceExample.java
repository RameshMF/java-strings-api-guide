package com.javaguides.stringbuffer.methods;

public class ReplaceExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("jaguides");
		
		// replace ja with java- start index 0 and end index -1
		StringBuffer subBuffer = buffer.replace(0, 2, "java");
		
		System.out.println(subBuffer);
	}
}
