package com.codezmr.interface_enhancement.staticmethod;

public class StaticMethodDemoClass implements StatticMethodDemo{
	
	public static void main(String[] ar) {
		
		StaticMethodDemoClass obj = new StaticMethodDemoClass();
		
		//obj.show(); // Static method not available in this class
		StatticMethodDemo.show();// for use static in class have to call like this.
		
		obj.show();
		
	}
	
	//can not be override the static method of interface
	public static void show(){
		System.out.println("I am Static method of StaticMethodDemoClass ");
	}
}
