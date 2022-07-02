package com.codezmr.interface_enhancement.staticmethod;

public interface StatticMethodDemo {
	
	public static void show(){ //static method do not available in implementing classes.
		System.out.println("I am a Java 8 Static method");
	}
	
	public static void show2(){ //static method do not available in implementing classes.
		System.out.println("I am a Java 8 Static method");
	}
	
	public static void main(String[] args) {
		System.out.println("From java 8 onward main method can be in interface also");
	}
}


