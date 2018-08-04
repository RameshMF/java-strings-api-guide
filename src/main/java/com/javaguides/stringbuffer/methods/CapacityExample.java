package com.javaguides.stringbuffer.methods;

public class CapacityExample {
	public static void main(String[] args) {
		StringBuffer builder = new StringBuffer("javaguides");
		int capacity = builder.capacity();
		
		// inital capacity
		System.out.println(new StringBuffer().capacity());
		
		// intial capacity 16 + number of characters in string
		System.out.println("Capacity of the string :: " + capacity);
	}
}
