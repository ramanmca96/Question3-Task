package com.Test;

public class XYZReturnPrograms {

	public static void main(String[] args) {

		String First = "XYZ", Last = "YXZ";

		if (First.length() != Last.length()) {

			System.out.println("Second Value is not a rotation of first Value");
		}

		else {

			First = First.concat(First);
			if (First.indexOf(Last) != -1)
				System.out.println("Second Value is a rotation of first Value");
			else
				System.out.println("Second Value is not a rotation of first Value");
		}
	}
}
