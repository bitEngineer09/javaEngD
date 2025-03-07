package String_StringBuilder_StringBuffer;

// NOTE -> String are Thread-Safe, but are immutable
// StringBuilder are not, but are mutable

public class StringBuilder {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("World");
        System.out.println(s1); // o/p -> Hello : coz strings are immutable

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello"); // ab hum operations kar sakte hai
                                                       // ye mutable hai
                                                       // method chaining kar sakte hai
        // INTERNAL WORKING ->
        // internally ek char arry banti hai of size (16)
        // on full it gets doubled
        // then purani array ke elements copy ho jaate hai new array me
        sb.append(" World");
        sb.append(", This is").append(" me.");  // method chaining
        sb.append("Big Bang").replace(1, 2, "seb").length(); // method chaining
        System.out.println(sb);
        sb.delete(1, 4);                 // delete range
        sb.insert(1, "Java");   // 1 pe Java insert karega
        sb.reverse();                    // reverse String
        sb.charAt(0);                    // Get character at given position
        sb.length();                     // Get Length
        sb.substring(1, 4);              // Get substring
        sb.replace(2, 3, "Brother"); // Replaces

        String str = sb.toString(); // ab fir se use immutable bana diya
        final int apple = sb.lastIndexOf("Apple");
    }
}
