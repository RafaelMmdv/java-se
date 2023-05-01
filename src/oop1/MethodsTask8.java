package oop1;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsTask8 {

    public static boolean result(int[] arr){

        for (int j = 0; j < arr.length-1; j++){

            if (arr[j] > arr[j+1]){
                return false;
            }

        }
return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu daxil edin: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++){

            System.out.println((i+1) + "-ci ededi daxil edin");
            arr[i] = sc.nextInt();

        }

        System.out.println(result(arr));

    }
}
