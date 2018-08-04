package com.javaguides.strings.methods;

public class ChatAtExample {
	public static void main(String[] args) {
		//charAtExample1();
		//charAtExample2();
		charAtExample3();
	}

	public static void charAtExample1() {
		String str = "Welcome to string handling guide";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(5);
		char ch3 = str.charAt(11);
		char ch4 = str.charAt(20);
		System.out.println("Character at 0 index is: " + ch1);
		System.out.println("Character at 5th index is: " + ch2);
		System.out.println("Character at 11th index is: " + ch3);
		System.out.println("Character at 20th index is: " + ch4);
	}

	// IndexOutOfBoundsException - if the index argument is negative or not less
	// than the length of this string.
	public static void charAtExample2() {
		String str = "Java Guides";
		char ch1 = str.charAt(str.length() + 1);
		System.out.println("character :: " + ch1);
	}

	// How to get first and last chanracter of the string
	public static void charAtExample3() {
		String str = "Java Guides";
		int strLength = str.length();
		// Fetching first character
		System.out.println("Character at 0 index is: " + str.charAt(0));
		// The last Character is present at the string length-1 index
		System.out.println("Character at last index is: " + str.charAt(strLength - 1));
	}
}
