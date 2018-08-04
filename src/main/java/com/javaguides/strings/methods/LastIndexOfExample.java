package com.javaguides.strings.methods;

public class LastIndexOfExample {
	public static void main(String[] args) {
		String str = "javaguides";
		
		// method1
		int lastIndexOf = str.lastIndexOf('s');
		System.out.println(" last index of given character 's' in' "
				+ " "+ str+"' ::  " + lastIndexOf);
		
		// method 2
		lastIndexOf = str.lastIndexOf("guides");
		System.out.println(" last index of given string 'guides' in' "
				+ " "+ str+"' ::  " + lastIndexOf);
		
		// method 3
		lastIndexOf = str.lastIndexOf("guides", 4);
		System.out.println(" last index of guides in given  string "
				+ " "+ str+" and from index  " + lastIndexOf);
		
		// method 4
		lastIndexOf = str.lastIndexOf('g', str.length());
		System.out.println(" last index of given char ::  " + lastIndexOf);
		
	}
}
