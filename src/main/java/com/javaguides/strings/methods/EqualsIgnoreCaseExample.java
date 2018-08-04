package com.javaguides.strings.methods;

public class EqualsIgnoreCaseExample {
	public static void main(String[] args) {
		String str = "javaguides";
		boolean equal = str.equalsIgnoreCase("JAVAguides");
		System.out.println("Strings are equal :: "  + equal);
	}
}
