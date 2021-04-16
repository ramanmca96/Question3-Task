package com.Test;

import java.util.ArrayList;

public class AddElementToArrayList {

	public static void main(String[] args) {

		// Create a Objects for ArrayList
		ArrayList<String> languages = new ArrayList<String>();

		// Using Add Method Add The Element
		languages.add("Java");
		languages.add("Selenium");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("Java Spring Boot");
		languages.add("Java");
		languages.add("Machine Learning");
		languages.add("Selenium");

		// With The Help Of For each Iterate The Values
		for (String list : languages) {

			System.out.println("Top Most Programming Languages Are :" + list);

		}
		System.out.println("   ");
		// find The Index Values
		String string = languages.get(5);
		System.out.println("The Value Of Given Index Values :" + string);

		System.out.println("   ");
		// To check Empty or Not
		boolean empty = languages.isEmpty();
		System.out.println("isEmpty() Method To Check Collection Object is Empty or Not:  " + empty);

		System.out.println("   ");
		// To check it Contains The Value or Not
		boolean contains = languages.contains("Java");
		System.out.println("USe Of Contains Method Check The Given Values :" + contains);

		System.out.println("   ");

		// remove the elements using remove Method
		String remove = languages.remove(3);
		System.out.println("Remove The Element With The Help Of remove() Method  " + remove);

		// update the already added AElement using Set Method
		System.out.println("   ");
		String set = languages.set(4, "Tamizh");
		System.out.println("After Updated The Elemnt " + set);

		for (String string2 : languages) {

			System.out.println("2nd Iterate " + string2);
		}

		// To find Size of Element
		int size = languages.size();
		System.out.println("Size Of all Element " + size);

	}

}
