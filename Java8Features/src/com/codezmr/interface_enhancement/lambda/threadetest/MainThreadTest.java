package com.codezmr.interface_enhancement.lambda.threadetest;

public class MainThreadTest {

	public static void main(String[] args) {

		Runnable runnable = new TestThreadLambda();
		
		Thread thread1 = new Thread(runnable);

		thread1.start();

		for (Integer count = 1; count <= 5; count++) {

			System.out.println("===>I am in main Method: " + count);

		}

	}

}
