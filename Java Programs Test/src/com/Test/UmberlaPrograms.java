package com.Test;

public class UmberlaPrograms {

	public static void main(String[] args) {

		String name = "Umberla";

		char[] charArray = name.toCharArray();

		int length = charArray.length;

		boolean contains = name.contains("e");
		System.out.println("Given Umberla Word have Letter e:" + contains);

	}
}
