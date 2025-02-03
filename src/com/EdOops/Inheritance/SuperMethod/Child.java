package com.EdOops.Inheritance.SuperMethod;

public class Child extends Parent{

    public Child(String eyeColor, int height) {
        super(eyeColor, height); // also used to call parameterized constructor of super class

//      super(); It is super keyword, it calls supper class.

        System.out.println("Child constructor called.");
    }


    public void child() {
        super.parent(); // ese first line me likhna jaruri nahi hai
        System.out.println("Child method called.");
        super.getHeight(); // fields
    }
}
