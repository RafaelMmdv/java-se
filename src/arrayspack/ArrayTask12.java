package arrayspack;

import java.util.Arrays;

public class ArrayTask12 {

    public static void main(String[] args) {

        int [] arr = {14, 28, 32};



        int[] arr1 = new int[3];
        int k = 0;

        for (int i = arr.length-1; i>=0; i--){
            arr1[k] = arr[i];
            k++;

        }
        System.out.println(Arrays.toString(arr1));
    }
}
