package oop1;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsTask9 {

    public static String result (String word){

         String ters = "";

        for (int i = word.length()-1;i >= 0; i-- ){
            ters +=word.charAt(i);
        }
        return ters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin");
        String word = sc.next();

        System.out.println(result(word));
    }
}
