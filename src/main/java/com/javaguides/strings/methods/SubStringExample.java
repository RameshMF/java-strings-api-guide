package com.javaguides.strings.methods;

public class SubStringExample {
	public static void main(String[] args) {
		String str = "javaguides";
		
		// substring from start to end
		String subStr = str.substring(0, str.length());
		System.out.println("substring from 0 to length of the string : " + subStr);
		
		subStr = str.substring(4);
		System.out.println("Sub string starts from index 4 : " + subStr);
		
		// Remember index starts from 0
		System.out.println(str.substring(1));
		
		System.out.println("unhappy".substring(2));
		System.out.println("Harbison".substring(3));
		System.out.println("emptiness".substring(8));
	}
}
