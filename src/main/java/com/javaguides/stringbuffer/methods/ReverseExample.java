package com.javaguides.stringbuffer.methods;

public class ReverseExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		StringBuffer reverse = buffer.reverse();
		System.out.println("Reversed string :" + reverse);
	}
}
