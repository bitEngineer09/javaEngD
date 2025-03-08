package _2_CollectionFramework._4_MapInterface._1HashMapsOne.WeakHashMaps;

import java.util.WeakHashMap;

public class WeakHashMapsDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imgCache = new WeakHashMap<>();

//        imgCache.put("img1", new Image("Image 1"));
//        imgCache.put("img2", new Image("Image 2"));
//        System.out.println(imgCache);
//        System.gc();
//        stimulateApplicationRunning(); // aisa samajh ki yaha koi bada kaam chal ra hai
//        System.out.println("Cache after running (some entries may be cleared): " + imgCache);

        // 1) etna kuch karne ke baad bhi gc kaam nahi karega kyuki jo keys hai vo String literal hai,
        // jo ki String pool me stored hai, Means it is a strong reference throughout the lifecycle of the whole program.
        // agar mai 'img1' ko jitne baar bhi use karta hu, to usi memory location se vo string use hogi.
        // Therefore we have to make non-literal keys

        // humne yaha directly String nahi likha hai balki uska obj banaya hai
        imgCache.put(new String("img1"), new Image("Image 1"));
        imgCache.put(new String("img2"), new Image("Image 2"));
        System.gc();  // ab jvm sab uda dega
        stimulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imgCache);

        // hum ye variable leke bhi kar sakte hai but use alag method me declare karna padega
        // see in pgm WeakHashMapsOth
    }


    private static void stimulateApplicationRunning() {
        try {
            System.out.println("Stimiluation Application is running...");
            Thread.sleep(5000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Image {
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
