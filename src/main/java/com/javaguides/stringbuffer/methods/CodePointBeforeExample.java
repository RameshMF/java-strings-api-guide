package com.javaguides.stringbuffer.methods;

public class CodePointBeforeExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		int unicode = buffer.codePointBefore(1);
		System.out.println("the character (Unicode code point) at the before specified index is :: " + unicode);
	}
}
