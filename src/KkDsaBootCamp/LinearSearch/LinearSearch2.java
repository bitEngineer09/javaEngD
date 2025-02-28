package KkDsaBootCamp.LinearSearch;

public class LinearSearch2 {
    public static void main(String[] args) {
        int arr[] = {5,6,7,89,645};
        final int check = linearSearch(arr, 645);
        System.out.println(check);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0; // yaha hum element return karva re hai so 0 can also
                      // be the part of that array, so its not a good practice.
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
