package com.codezmr.interface_enhancement.doubleColon.constructorRefrance;

public class MainClass {

	public static void main(String[] args) {
		
		//ConstRefranceFI constRefranceFI = () -> new Employee("222", "ZMR", "23");
		
		ConstRefranceFI constRefranceFI = Employee :: new;
		
		constRefranceFI.getEMployee("222", "ZMR", "23");
			
	}

}
