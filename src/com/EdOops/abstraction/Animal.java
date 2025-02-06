package com.EdOops.abstraction;


public abstract class Animal {

    private boolean superPowers;

    protected Animal(){
        this.superPowers = superPowers;
    }

    public abstract void sound();    // abstract method, eski body child class me dalenge.

    public void sleep() {            // concrete method, means method having body
        System.out.println("zzz....");
    }
}