package oop1;

import java.util.Scanner;

public class MethodsTask11 {

    public static boolean result(String soz){

        if (soz.startsWith("a")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Soz daxil edin: ");
        String soz = sc.next();

        System.out.println(result(soz));

    }
}
