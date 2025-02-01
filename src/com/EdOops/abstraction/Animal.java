package com.EdOops.abstraction;

// NOTE --> agar kisi method ko abstract declare kiya hai to class ko bhi karna padega.
// Abstract class contains abstract as well as concrete methods also.
// We cannot create object for abstract class, but constructor bana sakte hai and use protected declare karna hoga for some reason
// Agar abstract class ko public nahi kiya to other packages ke child class access nahi kar
// paaenge. Then it will become package private.
// protected access modifier ke liye inheritance karna jaruri hai

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