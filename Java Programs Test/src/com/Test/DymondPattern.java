package com.Test;

public class DymondPattern {

	public static void main(String[] args) {
		int n = 3;
		// for increasing portion
		for (int i = 1; i <= n; i++) {
			// print space
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// print star
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			// new line
			System.out.println();
		}

		// for decrement portion
		for (int i = n - 1; i >= 1; i--) {
			// print space
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			// print star
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			// new line
			System.out.println();
		}
	}
}
