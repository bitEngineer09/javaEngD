package KkDsaBootCamp.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,5};
        final int check = min(arr);
        System.out.println(check);
    }

    static int min(int[] arr) {
        int min = arr[0]; // humne assume kar liya ki minimum arr[0] hai

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        return min;
    }
}
