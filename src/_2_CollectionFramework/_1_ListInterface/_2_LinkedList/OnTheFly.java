package _2_CollectionFramework._1_ListInterface._2_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class OnTheFly {
    public static void main(String[] args) {

//      LinkedList le constructor me koi list pass kar denge
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Pussy", "Rat", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "Rat"));

        animals.removeAll(animalsToRemove); // remove all common elements hata deta hai
        System.out.println(animals);
    }
}
