package com.javaguides.stringbuffer.methods;

public class ChatAtExample {
	public static void main(String[] args) {
		charAtExample1();
		//charAtExample2();
		charAtExample3();
	}

	public static void charAtExample1() {
		StringBuffer buffer = new StringBuffer("Welcome to string handling guide");
		char ch1 = buffer.charAt(0);
		char ch2 = buffer.charAt(5);
		char ch3 = buffer.charAt(11);
		char ch4 = buffer.charAt(20);
		System.out.println("Character at 0 index is: " + ch1);
		System.out.println("Character at 5th index is: " + ch2);
		System.out.println("Character at 11th index is: " + ch3);
		System.out.println("Character at 20th index is: " + ch4);
	}

	// IndexOutOfBoundsException - if the index argument is negative or not less
	// than the length of this string.
	public static void charAtExample2() {
		StringBuffer builder = new StringBuffer("Java Guides");
		char ch1 = builder.charAt(builder.length());
		System.out.println("character :: " + ch1);
	}

	// How to get first and last chanracter of the string
	public static void charAtExample3() {
		StringBuffer buffer = new StringBuffer("Java Guides");
		int strLength = buffer.length() - 1;
		// Fetching first character
		System.out.println("Character at 0 index is: " + buffer.charAt(0));
		// The last Character is present at the string length-1 index
		System.out.println("Character at last index is: " + buffer.charAt(strLength));
	}
}
