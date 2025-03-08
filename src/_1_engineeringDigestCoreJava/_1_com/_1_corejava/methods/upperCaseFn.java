package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.methods;
// uppercase fn

public class upperCaseFn {
    public static void main(String[] args) {
        String b = "  gautam";
        String c = upperFn(b);
        System.out.println(c);
    }

    public static String upperFn(String a){
        return a.trim().toUpperCase();
    }

}
