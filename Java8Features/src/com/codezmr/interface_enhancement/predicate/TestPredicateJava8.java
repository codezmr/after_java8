package com.codezmr.interface_enhancement.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateJava8 {


	public static void main(String[] args) {
		
		//Predicate<Integer> predicate = (Integer age) ->{return age>18;};
		
		Predicate<Integer> predicate = age -> age>18;
		
		System.out.println(predicate.test(23));
		
		
		ArrayList<String> name = new ArrayList<String>();
		//Predicate<ArrayList<String>> predicate2 = (ArrayList<String> list)-> {return list.isEmpty();};
		
		Predicate<ArrayList<String>> predicate2 = list -> list.isEmpty();
		
		System.out.println(predicate2.test(name));
		
		name.add("Zamiruddin");

		System.out.println(predicate2.test(name));
	}

}
