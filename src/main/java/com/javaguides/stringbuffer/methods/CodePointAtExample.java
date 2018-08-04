package com.javaguides.stringbuffer.methods;

public class CodePointAtExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		int unicode = buffer.codePointAt(0);
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
	}
}
