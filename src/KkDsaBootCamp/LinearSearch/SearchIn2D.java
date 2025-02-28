package KkDsaBootCamp.LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, // i = 1
                {4,5,6},        // i = 2
                {7,8,9}         // i = 3
        };

        int[] check = search(arr, 10);
        System.out.println(Arrays.toString(check));
    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {0};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
