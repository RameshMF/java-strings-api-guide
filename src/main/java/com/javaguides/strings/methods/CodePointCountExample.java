package com.javaguides.strings.methods;

public class CodePointCountExample {
	public static void main(String[] args) {
		String str = "javaguides";
		System.out.println("length of the string :: " + str.length());
		int unicode = str.codePointCount(0, str.length());
		System.out.println("the character (Unicode code point) "
				+ " at the specified index is :: " + unicode);
	}
}
