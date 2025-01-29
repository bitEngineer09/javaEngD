package arrays;
// find max element

public class ques2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 43;
        arr[3] = 550;
        arr[4] = 520;
        arr[5] = 16;
        arr[7] = 24;

        int res = Integer.MIN_VALUE; // this is negative infintity...
//        humne res = 0 nahi kiya coz agar values agar hamari negative me bhi hoti to max value hum find nahi kar paate.

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > res){
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
