package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.methods;
// SumOfAray Fn
public class sumOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 76, 43};
        int result = sumOfArray(arr1);
        System.out.println(result);
//            OR
        System.out.println(sumOfArray(arr1));
    }
    public static int sumOfArray (int[] arr){
        int res = 0;
        for (int k : arr){
            res += k;
        }
        return res;
    }
}
