package com.engineeringdigest.corejava.arrays;
// Finding element in an array
public class ques1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 34;
        arr[9] = 67;
        arr[8] = 37;
        arr[6] = 89;
        for (int i : arr){
            if (i == 67){
                System.out.println("Found");
            }
        }
    }
}
