package com.javaguides.strings.methods;

public class CompareToIgnoreCaseExample {
	public static void main(String[] args) {
		compateToExmaple1();
		//compateToExmaple2();
	}

	public static void compateToExmaple1() {
		String s1="Hello World";  
		String s2="hello world";  
		String s3="Java";  
		String s4="java";  
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s3.compareToIgnoreCase(s4));  
	}

	// Compareto with black or empty string
	public static void compateToExmaple2() {
		String s1="hello";  
		String s2="";  
		String s3="me";  
		
		// compare with empty string, returns length of the string
		System.out.println(s1.compareToIgnoreCase(s2));
		
		// If first string is empty, result would be negative
		System.out.println(s2.compareToIgnoreCase(s3)); 
	}
}
