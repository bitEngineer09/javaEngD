package com.EdOops.constructors;
// Constructors are special methods used to initialize the object.
// They have SAME NAME as className
// they don't have any return type.
public class constructors {

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.getName()); // humne koi naam set nahi kiya therefore default value print hogi.
//        This default value is set by default constructor.

        System.out.println(a.getId());  // default value aaegi

        System.out.println(a.getAge()); // default value aaegi

//        A a = new A("Gautam", 0920, 21); ye daalne se paramterized constructor kaam karega

    }
}

