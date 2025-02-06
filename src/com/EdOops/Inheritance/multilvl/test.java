package com.EdOops.Inheritance.multilvl;

public class test {
    public static void main(String[] args) {
//        Child child = new Child(); // By only this hum dekh sakte hai ki es case me konsa constructor pehle call hoga.

        Parent parent = new Parent(); // parent is inheriting grandparent
        parent.setName("papa");
        parent.setAge(46);
        System.out.println(parent.getName());
        System.out.println(parent.getAge());
        parent.greet();

        Child child = new Child(); // child is inheriting parent and, parent is inheriting grandparent
        child.setName("Gautam");
        child.setAge(8);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        child.greet(); // parent class vala method call hoga, if parent class me ye method nahi hua to
//        grandparent ka method call hoga.
    }
}
