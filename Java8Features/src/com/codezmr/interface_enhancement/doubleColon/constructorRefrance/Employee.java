package com.codezmr.interface_enhancement.doubleColon.constructorRefrance;

public class Employee {
	
	String eid;
	String name;
	String age;
	
	Employee(){
		
		System.out.println("I am Employee Const");
	}
	
	public Employee(String eid, String name, String age) {
		
		this.eid = eid;
		this.name = name;
		this.age = age;
		
		System.out.println("Employee ID: "+ this.eid);
		System.out.println("Employee Name: "+ this.name);
		System.out.println("Employee Age: "+ this.age);
	}
	
	
	
}
