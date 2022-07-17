package com.codezmr.interface_enhancement.doubleColon.methodRefrance;

public class MainClass {

	public static void main(String[] args) {
		
		//Employee employee = new Employee();
		
		//Instance Method
		/*
		 * LambdaOne lambdaOne = () -> System.out.println("From lambda one");
		 * 
		 * lambdaOne.show();
		 * 
		 * LambdaOne lambdaOne1 = employee :: details;
		 * 
		 * lambdaOne1.show();
		 */
		
		//with arrg method
		
		/*
		 * LambdaTwo lambdaTwo = employee :: eid; lambdaTwo.show2(2212);
		 */
		
		
		//static method
		
		LambdaTwo lambdaTwo = Employee :: name;
		
		lambdaTwo.show("Md Zamiruddin");
		
		
	}

}
