package com.codezmr.interface_enhancement.predicate;

import java.util.function.Predicate;

public class Example4 {
	
	public static void main(String[] args) {
		
		String name = "zamir";
		
		Predicate<String> nameCheckEqual = Predicate.isEqual("zamir");
		
		System.out.println(nameCheckEqual.test(name));
	}

}
