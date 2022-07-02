package com.codezmr.interface_enhancement.defaultmethod;

public interface GunJava8 {
	
	void skin();
	void damage();
	
	
	default void equipment() {
		System.out.println("Hey i am java8 feature in interface having default methods.");
	}
	
	default void range() {
		System.out.println("Hey i am java8 feature in interface having default methods.");
	}
}
