package com.engineeringdigest.corejava.Enum;

public class Test {
    public static void main(String[] args) {
        Day monday = Day.MONDAY; // It is like Student student = new Student();
        int ordinal = monday.ordinal();
        System.out.println(ordinal); // prints index
        System.out.println(monday.name());
        System.out.println(monday.toString()); // same as .name()


    }
}
