package com.javaguides.strings.methods;

public class ContentEqualsExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = "javaguides";
		
		boolean isContentEquals = str.contentEquals(subStr);
		System.out.println("isContentEquals :: " + isContentEquals);
		
		isContentEquals = str.contentEquals(new StringBuffer(subStr));
		
		System.out.println("isContentEquals :: " + isContentEquals);
	}
}
