package com.codezmr.interface_enhancement.lambda;

public class TestLambda {

	public static void main(String[] args) {
		
		Calculator calc = (Integer n1, Integer n2) ->{
			
			return n1+n2;
		};
		
		System.out.println(calc.add(90, 20));
	}

}
