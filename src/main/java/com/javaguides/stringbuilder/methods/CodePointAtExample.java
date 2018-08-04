package com.javaguides.stringbuilder.methods;

public class CodePointAtExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		int unicode = builder.codePointAt(0);
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
	}
}
