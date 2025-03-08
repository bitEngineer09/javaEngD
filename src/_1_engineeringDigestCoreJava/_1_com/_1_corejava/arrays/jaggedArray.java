package _1_engineeringDigestCoreJava._1_com.engineeringdigest.corejava.arrays;

public class jaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][]; //shows ki kitne array hongi, in this case we have 4 arrays.
        arr[0] = new int[3]; // pehle array ki length 3
        arr[1] = new int[6]; // dusre ki length 6
        arr[2] = new int[4];
        arr[3] = new int[9];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
