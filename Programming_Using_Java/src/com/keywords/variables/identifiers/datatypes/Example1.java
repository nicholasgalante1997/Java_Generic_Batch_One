package com.keywords.variables.identifiers.datatypes;

public class Example1 {
	public static void main(String[] args) {
		
		// Variable Declaration
		String name;
		
		// Variable initialization
		name = "Nick G";
		
		// Variable declaration and initialization in one line
		int age = 23;
		
		System.out.println(
				"My name is " + name + 
				" and I'm " + age + 
				" and I love Java programming!"
		);
		
		System.out.println();
		
		// Primitive Types (8)
		
		boolean tired = true; // boolean type
		byte smallNum = 0; // byte type
		char currentMood = 'L'; // char type
		int integer = 44; // int type
		short shortNum = 22; // short type
		long ratherLargeNum = 570_000_000L; // long
		float pi = 3.14f; // float 
		double fib = 1.6517; // double 
		
		// Reference Types (Objects and such)
		String house = "Stark";
		
		System.out.println("Primitive Data Types");
		System.out.println("example of boolean: " + tired);
		System.out.println("example of byte: " + smallNum);
		System.out.println("example of char: " + currentMood);
		System.out.println("example of int: " + integer);
		System.out.println("example of short: " + shortNum);
		System.out.println("example of long: " + ratherLargeNum);
		System.out.println("example of float: " + pi);
		System.out.println("example of double: " + fib);
		
		System.out.println("\nReference Types");
		System.out.println("example of reference type: " + house);
		
	}
}
