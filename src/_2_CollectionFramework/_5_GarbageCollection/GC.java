package _2_CollectionFramework._5_GarbageCollection;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        Phone phone = new Phone("Mi", "6A");
        // ye ek StrongReference hai, jab tak eske ref ko null
        // nahi karenege tab tak GC call nahi hoga.

        System.out.println(phone);

        phone = null;  // phone ko null karne ke baad jo purani object ki memory hai
                       // vo to vahi hai, jo ki space le ri hai.
                       // to JVM apne aap us memory ko destroy kar dega, kyuki uske corresponding koi bhi refernce nahi hai

        System.gc();  // ye hum jvm  ko bol re hai ki garbage colect kar lo
                      // but eski need nahi hai, jvm ese khud call kar leta hai


        WeakReference<Phone> phone1 = new WeakReference<>(new Phone("iPhone", "20 Pro Max"));
        // ye weakReference to agar ye use nahi hoga to jvm ese uda dega
        // esme ref ko null karne ki need nahi hai

        System.gc();
        System.out.println(phone1.get());
        try{
            Thread.sleep(5000);
        }
        catch (Exception e) {

        }
        System.out.println(phone1.get());

    }
}

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "Brand = " + brand + ", Model = " + model + "}";
    }
}
