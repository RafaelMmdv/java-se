package stringpack;

import java.util.Arrays;

public class StringMethodsTask3 {

    public static void main(String[] args) {

        String cumle = "Salam menim adim Rafaeldi";

        String [] arr1 = cumle.split(" ");
        System.out.println(Arrays.toString(arr1));

        char [] ad = new char [arr1[0].length()];
        System.out.println(Arrays.toString(ad));

    }
}
