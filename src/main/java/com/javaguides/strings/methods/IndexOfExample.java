package com.javaguides.strings.methods;

public class IndexOfExample {
	public static void main(String[] args) {
		String str = "javaguides";
		
		// method 1
		int index = str.indexOf("java");
		System.out.println(index);
		
		// Remember index starts with 0 so count from 0
		System.out.println("index of guides :: " + str.indexOf("guides"));
		
		System.out.println(" index of des :: " + str.indexOf("des"));
		
		// method 2
		System.out.println(str.indexOf('s'));
		
		// method 3
		System.out.println(str.indexOf('g', 0));
		
		// method 4
		System.out.println(str.indexOf("guides", 3));
	}
}
