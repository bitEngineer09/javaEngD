package com.engineeringdigest.corejava.StaticIntro;
// 1) static use karne se without instance ke call kar sakte hai methods ko.
// 2) static can be class, members, methods and blocks.
// 3) we call static methods directly by class using static.
// 4) this and super cannot be used in static context.
// 5) The static method can not use non static data member or call non-static method directly.
// 6) static is initialised before any instances, chahe obj create kare yaa naa kare static to chalega hee
// 7) STATIC BLOCK tab exec. hota hai jab class laod hoti hai memory me
// 8) Static blocks tab use hote hai jab hume kuch one time karna hota hai, yaa fir tum koi logic use karna
//    chahte ho baar baar, use alag se class(Utility class) me likhke static
//    ke through main program me directly class se access kar sakte hai

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println(Student.getSchool());
        System.out.println(Student.getCount());

    }
}
