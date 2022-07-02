package com.codezmr.interface_enhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {

    public void show();// 1 abstract method

    public default void details(){//more than 1 default method

    }
    public default void details2(){//more than 1 default method

    }
    public static String enquire(){//more than 1 static method
        return "Functional Interface";
    }
    public static String enquire2(){//more than 1 static method
        return "Functional Interface";
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