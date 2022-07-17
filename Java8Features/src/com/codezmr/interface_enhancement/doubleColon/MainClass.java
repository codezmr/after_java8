package com.codezmr.interface_enhancement.doubleColon;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * LambdaOne lambdaOne = () -> System.out.println("From lambda one");
		 * 
		 * lambdaOne.show();
		 * 
		 * Employee employee = new Employee(); LambdaOne lambdaOne1 = employee ::
		 * details;
		 * 
		 * lambdaOne1.show();
		 */
		
		Employee employee = new Employee();
		
		LambdaTwo lambdaTwo = employee :: eid;
		lambdaTwo.show2(2212);
	}

}
