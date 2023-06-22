package javacoding22exercise;

import org.testng.annotations.Test;

public class EvenAndOddNumber {

	// Question 1: how to find the even or odd number?
	// 1. Declaration, 2. Looping, 3. Apply the java condition 4. Break the loop
	@Test
	public static void getEvenAndOdd() {

		int num = 12;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				// System.out.println("Even Number : " + i);
			} else {
				System.out.println("Odd Number : " + i);
			}
		}

	}
}
