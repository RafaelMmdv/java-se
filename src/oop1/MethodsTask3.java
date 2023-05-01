package oop1;

import java.util.Scanner;

public class MethodsTask3 {

    public static int result(int eded){
        int fact = 1;
            for(int i = 1; i<=eded; i++){
                fact *= i;
            }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int eded = sc.nextInt();

        int netice = result(eded);
        System.out.println(netice);
    }
}
