package KkDsaBootCamp.LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,65,66,56,57,58};
        final boolean check = search(arr, 2, 7, 48);
        System.out.println(check);
    }
    static boolean search(int[] arr, int init, int end, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = init; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

}
