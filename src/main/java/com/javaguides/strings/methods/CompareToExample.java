package com.javaguides.strings.methods;

public class CompareToExample {
	public static void main(String[] args) {
		// compateToExmaple1();
		compateToExmaple2();
	}

	public static void compateToExmaple1() {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "Java";
		String s4 = "Guides";
		System.out.println(s1.compareTo(s2));// 0 because both are equal
		System.out.println(s1.compareTo(s3));// -2 because "H" is 2 times lower
												// than "J"
		System.out.println(s1.compareTo(s4));// 1 because "G" is 1 times greater
												// than "H"
	}

	// Compareto with black or empty string
	public static void compateToExmaple2() {
		String s1 = "hello";
		String s2 = "";
		String s3 = "me";

		// compare with empty string, returns length of the string
		System.out.println(s1.compareTo(s2));

		// If first string is empty, result would be negative
		System.out.println(s2.compareTo(s3));
	}

}
