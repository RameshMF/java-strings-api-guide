package com.javaguides.strings.methods;

public class StartsWithExample {
	public static void main(String[] args) {
		String str = "javaguides";
		boolean startWith = str.startsWith("ja");
		System.out.println("startWith :: " +startWith);
		
		// Remember index starts from 0
		boolean startWithOffset = str.startsWith("guides", 4);
		System.out.println("startWithOffset :: " + startWithOffset);
	}
}
