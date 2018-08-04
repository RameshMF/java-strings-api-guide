package com.javaguides.stringbuffer.methods;

public class SetCharExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		buffer.setCharAt(0, 'J');
		System.out.println(buffer.toString());
	}
}
