package _2_CollectionFramework._4_MapInterface._1HashMapsOne.WeakHashMaps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapsOth {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.gc();
        stimulateApplicationRunning();
        System.out.println("Cache after running(some entries may be cleared): " + imageCache);
        // clear esliye ho gaya kyuki un String literals ka scope usi method tak hai
    }

    private static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1"); // ye Strong ref hai, but eska scope bass esi method tak hai
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));

    }

    private static void stimulateApplicationRunning() {
        try {
            System.out.println("Stimulate Application is running...");
            Thread.sleep(5000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class pic {
    String name;

    public pic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
