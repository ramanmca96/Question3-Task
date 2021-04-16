package com.Test;

public class PrintASCIIvalues {

	public static void main(String[] args) {
		int starts = 0;

		while (starts <= 255) {
			System.out.println(" The ASCII value of " + (char) starts + "  =  " + starts);
			starts++;
		}
	}
}
