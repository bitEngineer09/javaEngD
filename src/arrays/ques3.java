package arrays;
// print reverse of array
public class ques3 {
    public static void main(String[] args) {
        int[] arr = {23, 56,96, 85, 34};
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }

//  sum of array
        int sum = 0;
        for (int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        System.out.println("SUM is : "+sum);

//                       OR
        int res = arr[0] + arr[1] + arr[2] + arr[3];
        System.out.println("RESULT is : "+res);

//               SUM using FOR EACH
        int loopAns = 0;
        for (int k: arr){
            loopAns += k;
        }
        System.out.println("Sum using for each : "+loopAns);
    }
}
