package com.codezmr.interface_enhancement.predicate;

import java.util.function.Predicate;

public class TestPredicateJava8 {

	public static void main(String[] args) {
		
		//Predicate<Integer> predicate = (Integer age) ->{return age>18;};
		
		Predicate<Integer> predicate = age -> age>18;
		
		System.out.println(predicate.test(23));

	}

}
