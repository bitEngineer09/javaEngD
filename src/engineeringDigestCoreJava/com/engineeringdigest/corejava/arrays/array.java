package engineeringDigestCoreJava.com.engineeringdigest.corejava.arrays;

public class array {
    public static void main(String[] args) {
//        type[] variable;
        /*
        1) 'new' array obj ke liye memmory allocate kar ra hai HEAP me and 'arr' REFERENCE variable hai..
        2) 'arr(ref)' stores address of the starting index..
        3) 'arr' itself is stored in stack memory.
        */
        int[] arr = new int[10];
        arr[0] = 1;
        arr[3] = 6;
        System.out.println(arr.length); // length method nahi hai, it is PROPERTY which holds size of array..
//        for (int i = 0; i <= arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        Another way of printing arrays (FOR EACH loop)
        for (int i: arr){
            System.out.println(i);
        }
    }
}
