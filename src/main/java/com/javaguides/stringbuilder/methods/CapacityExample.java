package com.javaguides.stringbuilder.methods;

public class CapacityExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		int capacity = builder.capacity();
		
		// inital capacity
		System.out.println(new StringBuilder().capacity());
		
		// intial capacity 16 + number of characters in string
		System.out.println("Capacity of the string :: " + capacity);
	}
}
