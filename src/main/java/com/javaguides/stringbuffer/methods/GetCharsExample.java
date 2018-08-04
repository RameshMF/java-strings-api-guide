package com.javaguides.stringbuffer.methods;

public class GetCharsExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		char[] dst = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), dst, 0);
		
		for (char c : dst) {
			System.out.println(c);
		}
	}
}
