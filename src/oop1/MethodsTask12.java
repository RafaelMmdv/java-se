package oop1;

import java.util.Scanner;

public class MethodsTask12 {

    public static int result(String soz){

        int cem = 0;
        for (int i = 0; i < soz.length(); i++){
            int kod = soz.charAt(i);
            cem += kod;
        }
        return cem;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Soz daxil edin: ");
        String soz = sc.next();

        System.out.println(result(soz));
    }
}
