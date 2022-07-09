package com.codezmr.interface_enhancement.lambda.threadetest;


public class TestThreadLambda implements Runnable{

	@Override
	public void run() {
		
		for(Integer count = 1; count <=5; count++) {
			
			System.out.println("I am in Run Method: "+count);
			
		}
		
	}

}
