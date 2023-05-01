package oop1;

import java.util.Scanner;

public class MethodsTask2 {

    public static boolean netice(int eded){
        if (eded%3==0 || eded%4==0){
            return true;
        }
            return false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int eded = sc.nextInt();

        boolean result = netice(eded);
        System.out.println(result);
    }
}
