package com.javaguides.stringbuilder.methods;

public class SetCharExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		builder.setCharAt(0, 'J');
		System.out.println(builder.toString());
	}
}
