package com.javaguides.strings.methods;

public class SplitExample {
	public static void main(String[] args) {
		String str = "java,guides.net";
		String[] strArray = str.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		strArray = str.split(",", 0);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
