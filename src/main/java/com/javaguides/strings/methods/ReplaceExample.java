package com.javaguides.strings.methods;

public class ReplaceExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = str.replaceFirst("[a-z]", "java");
		System.out.println(subStr);
	}
}	
