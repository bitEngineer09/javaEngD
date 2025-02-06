package com.EdOops.Inheritance.Interfaces;

public class test {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.eat();
        System.out.println(dog.Max_Age);
        Animal.info();
//        dog.info(); error
        dog.run();

    }
}
