package com.javaguides.strings.methods;

public class EndsWithExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = "guides";
		boolean endsWith = str.endsWith(subStr);
		System.out.println(str + " endsWith " + subStr +"  :: " + endsWith);
	}
}
