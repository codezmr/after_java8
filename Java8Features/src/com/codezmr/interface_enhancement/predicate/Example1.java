package com.codezmr.interface_enhancement.predicate;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		
		// check the number is Even or Odd?
		
		Predicate<Integer> isOddNum = number -> number % 2 !=0;

		System.out.println("Result: "+ isOddNum.test(7));
		
		
 
	}

}
