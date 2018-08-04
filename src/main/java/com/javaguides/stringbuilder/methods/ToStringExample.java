package com.javaguides.stringbuilder.methods;

public class ToStringExample {
	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("javaguides");
		System.out.println(buffer.toString());
		buffer.trimToSize();
	}
}
