package _3_Java8_Basics;

// Method reference --> use method without invoking & in place of lambda expression

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _8_MethodReference {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ram", "Shyam", "Ghanshyam"));

        // * first way of printing

        names.forEach(x -> System.out.println(x)); // * ander Consumer dala hai
                                                        // * har student ko consume kar ke print kar ra hai
                                                        // * esme hum method ko ander use kar re hai
                                                        // * method as a parameter diya jata hai


        // * second way of printing

        // lamda exp ki jagah method ref use kar do
        // but humne esme method hee de diya hai as reference
        // method as a parameter diya jata hai
        names.forEach(System.out::println);  // method reference, -> System.out::println ye method de diya hai or ab ese use kar lo
    }
}
