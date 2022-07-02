package com.codezmr.interface_enhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {
	
	public void test1();
	
	
	public default void m1() {
		
	}
	
	public default void m2() {
		
	}
	
	public static String f1() {
		return "FunctionalInterface";
	}
}

/*
 *  Functional Interface
   1. An interface having one and only one abstract method is a functional
   2. Runnable interface had only 1 abstract method called run() - ex. functional interface
   3. Comparable interface had only 1 abstract method called compareTo() - ex. functional interface
   4. Functional interface can have any number of default and static method but only 1 abstract method
   thats why it is also called as SAM interface
   
   *
   */