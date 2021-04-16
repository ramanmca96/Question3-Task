package com.Test;

import java.util.HashSet;
import java.util.Iterator;

public class AddelementstoHashSet {

	public static void main(String[] args) {

		// Create a Objects for ArrayList
		HashSet<String> Books = new HashSet<String>();

		// Using Add Method Add The Element
		Books.add("Java");
		Books.add("Selenium");
		Books.add("Python");
		Books.add("Ruby");
		Books.add("Java Spring Boot");
		Books.add("Java");
		Books.add("Machine Learning");
		Books.add("Selenium");

		// With The Help Of For each Iterate The Values
		for (String list : Books) {

			System.out.println("Top Most Programming Book Are :" + list);

		}
		System.out.println("   ");
		// To check Empty or Not
		boolean empty = Books.isEmpty();
		System.out.println("isEmpty() Method To Check Collection Object is Empty or Not:  " + empty);

		System.out.println("   ");
		// To check it Contains The Value or Not
		boolean contains = Books.contains("Java");
		System.out.println("USe Of Contains Method Check The Given Values :" + contains);

		System.out.println("   ");

		// remove the elements using remove Method
		boolean remove = Books.remove("ruby");
		System.out.println("Remove The Element With The Help Of remove() Method  " + remove);

		// To find Size of Element
		System.out.println("   ");
		int size = Books.size();
		System.out.println("Size Of all Element " + size);

		System.out.println("   ");
		// Iterate The Value Using Iterate
		Iterator<String> iterator = Books.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			System.out.println("Using Iterated " + string);
			
		

		}

	}
}
