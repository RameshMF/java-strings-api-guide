package com.javaguides.strings;

public class StringAPIExamples {
	
	public static void main(String[] args) {
		//stringCharAtMethodUsage();
		stringLengthMethodUsage();
	}
	
	public static void stringCharAtMethodUsage(){
		String str = "Welcome to string handling guide";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(5);
		char ch3 = str.charAt(11);
		char ch4 = str.charAt(20);
		System.out.println("Character at 0 index is: "+ch1);
		System.out.println("Character at 5th index is: "+ch2);
		System.out.println("Character at 11th index is: "+ch3);
		System.out.println("Character at 20th index is: "+ch4);
	}

	public static void stringEmptyMethodUsage(){
		String str = "Welcome to string handling guide";
		System.out.println(str.isEmpty());
	}
	
	public static void stringLengthMethodUsage(){
		String str = "Welcome to string handling guide";
		System.out.println(str.length());
		System.out.println(str.codePointBefore(1));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointCount(1, 3));
	}
}
