package com.EdOops.Inheritance.heirarchical;

public class test {
    public static void main(String[] args) {
//        Animal cat = new Cat(); Humne yaha Parent class ka ref. leke child,
//        class (Cat) ka object create kiya. --> also known as UPCASTING
//        upper code is also right, bass relation sahi hona chahiye
//        esse ye farak padega ki only parent class ke methods hee call kara sakte hai
        Cat cat = new Cat();
        cat.setName("Tom");
        System.out.println(cat.getName());
        cat.sound();
    }
}
