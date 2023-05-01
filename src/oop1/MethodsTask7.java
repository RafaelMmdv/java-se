package oop1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MethodsTask7 {

    public static int result(int[] arr){

        int cem = 0;

        for (int j = 0; j < arr.length; j++){

            cem += arr[j];

        }
        return cem;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu daxil edin: ");
        int arrLength = sc.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length;i++){
            System.out.println((i+1) + "-ci ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(result(arr));
    }
}
