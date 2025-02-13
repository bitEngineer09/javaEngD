package engineeringDigestCoreJava.com.engineeringdigest.corejava.arrays;
// NOTE --> array of different length of array is called as JAGGED Arrays.
public class twoDimArray {
    /*
-------------
| 0 | 0 | 0 |  arr[0]
-------------
| 0 | 0 | 0 |  arr[1]   3 x 3
-------------
| 0 | 0 | 0 |  arr[2]
-------------
*/
    public static void main(String[] args) {
        /*
        int[][] arr = new int[2][3]; // declaration
        arr[0][0] = 23;
        arr[0][1] = 43;
        arr[0][2] = 65;
        arr[1][0] = 76;
        arr[1][1] = 87;
        arr[1][2] = 98;
        */

        int[][] nums = {
                {11,23,35,45},
                {54,61,76,78},
                {90,45,23,45}
        };
        System.out.println(nums[1][1]); // accessing specific element by matrix concept..

//      print elements
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){ // cols me 'j' ko 'i' ki length ke baar loop karenge
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

//        char array
        char[][] arr1 = new char[3][2];
        arr1[0][0] = 'a';
        arr1[0][1] = 'b';
        arr1[1][0] = 'c';
        arr1[1][1] = 'd';
        arr1[2][0] = 'e';
        arr1[2][1] = 'f';
        for (int p = 0; p < arr1.length; p++){
            for (int q = 0; q < arr1[p].length; q++){
                System.out.print(arr1[p][q]+" ");
            }
            System.out.println();
        }

    }
}
