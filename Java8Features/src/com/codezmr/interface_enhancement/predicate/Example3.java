package com.codezmr.interface_enhancement.predicate;

import java.util.function.Predicate;

public class Example3 {

	public static void main(String[] args) {

		Integer[] numberList = { 2, 3, 92, 39, 33, 4, 9, 29, 19, 16, 17 };

		Predicate<Integer> isOddTest = number -> number % 2 != 0;

		for (Integer num : numberList) {

			if (isOddTest.test(num)) {

				System.out.println("Odd Number : " + num);
			}

			if (isOddTest.negate().test(num)) {

				System.out.println("Even Number : " + num);
			}
		}

		// Combine two Predicates

		// Find odd number from array which is greater than 10;

		Predicate<Integer> isGreater = number2 -> number2 > 10;

		for (Integer num : numberList) {

			// if(isGreater.test(num) && isOddTest.test(num))
			if (isGreater.and(isOddTest).test(num)) {

				System.out.println("Odd Number Greater Than Ten: " + num);
			}

		}

	}

}
