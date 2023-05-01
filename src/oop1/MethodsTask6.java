package oop1;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsTask6 {

    public static boolean result(int[] arrNum) {

        int[] ededler = new int[arrNum.length];

        for (int j = 0; j < arrNum.length; j++){
            for (int k = j + 1; k < arrNum.length; k++){

                if (arrNum[j] == arrNum[k]) {

                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu daxil edin");
        int arr = sc.nextInt();
        int[] arrNum = new int[arr];

        for (int i = 0; i < arrNum.length; i++){
            System.out.println((i + 1) +"-ci ededi daxil edin");
            arrNum[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrNum));


        System.out.println(result(arrNum));

    }
}
