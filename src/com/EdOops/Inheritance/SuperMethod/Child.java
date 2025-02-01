package com.EdOops.Inheritance.SuperMethod;

public class Child extends Parent{

    public Child(String eyeColor, int height) {
        super(eyeColor, height); // also used to call parameterized constructor of super class

//      super(); It is super keyword, it calls supper class.
//      super keyword refers immediate parent.
//      in defalut constructors, jvm ese apne aap call karta hai
//      it should be written in first line.
//      also used to call the super class constructor,methods, or fields in child class
        System.out.println("Child constructor called.");
    }


    public void child() {
        super.parent(); // ese first line me likhna jaruri nahi hai
        System.out.println("Child method called.");
        super.getHeight(); // fields
    }
}
