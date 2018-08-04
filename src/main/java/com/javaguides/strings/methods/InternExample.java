package com.javaguides.strings.methods;

public class InternExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String newStr = new String("javaguides");
		System.out.println(newStr.intern().equals(str));
		System.out.println(newStr.equals(str));
		newStr.intern();
		str.intern();
	}
}
