package com.javaguides.strings.methods;

public class CodePointAtExample {
	public static void main(String[] args) {
		String str = "javaguides";
		int unicode = str.codePointAt(0);
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
	}
}
