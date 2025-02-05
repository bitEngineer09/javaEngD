package com.engineeringdigest.corejava.Enum;
// Enumeration means list Of things.
// jab bhi koi data frequently use karte hai tab Enums use karte hai.
// fields hamesha constants likhne ke baad he declare karenge.
public enum Day {
    SUNDAY (1, "ravivar"), // bracket lagate hee hamar constructor call hoga, and ander uske parameters pass kiya hai.

    MONDAY(2, "somvar"),

    TUESDAY(3, "mangalvar"),

    WEDNESDAY (4, "budhvar"),

    THURSDAY(5, "veervar"),

    FRIDAY(6, "shukrvar"),

    SATURDAY (7, "shanivar"); // now these are constants.
                                                                  // In this sun, mon,... are the Final Instances of class Day
    private String lower;
    private int dayNum;


    public void display(){
        System.out.println("Today is : "+ this.name());
    }

    private Day(int dayNum, String lower){
        this.dayNum = dayNum;
        this.lower = lower;
        System.out.println("Custom Constructor called");
    }

    public String getLower(){
        return this.lower = lower;
    }

    public int getDayNum(){
        return this.dayNum = dayNum;
    }
}


