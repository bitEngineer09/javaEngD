package com.engineeringdigest.corejava.Interfaces;

public class dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
