package com.codezmr.interface_enhancement.predicate;

import java.util.function.Predicate;

public class Example2 {

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
	}

}
