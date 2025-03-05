package engineeringDigestCoreJava.com.engineeringdigest.corejava.methods;
// variable length arguments
public class numOfArgsPass {
    public static void main(String[] args) {
        int x = sum(1,45,32);
        System.out.println(x);
//           we can declare "ARRAY AS ARGUMENT" like this
        System.out.println(sum(new int[]{21, 54,32}));
    }

    public static int sum(int ...a){ // use '...' to declare variable length of arguments
        int result = 0;   // yaha hume multiple numbers ka sum ke liye array nahi banana padega.
        for (int k: a) {  // ese as "array" treat karenge.
            result += k;
        }
        return result;
    }
}

