package com.Test;

public class XYZReturnPrograms {

	public static void main(String[] args) {

		String First = "XYZ", Last = "YXZ";

		if (First.length() != Last.length()) {

			System.out.println("False");
		}

		else {

			First = First.concat(First);
			if (First.indexOf(Last) != -1)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
