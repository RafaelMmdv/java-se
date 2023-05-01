package stringpack;

import java.util.Arrays;

public class StringMethodsTask5 {

    public static void main(String[] args) {

        String ad1 = "rauf";
        String ad2 = "reshar";

//        char[] ch1 = new char[ad1.length()];
//        char[] ch2 = new char[ad2.length()];
//
//
//        for (int i = 0; i < ad1.length(); i++) {
//            ch1[i] = ad1.charAt(i);
//        }
//
//        for (int i = 0; i < ad2.length(); i++) {
//            ch2[i] = ad2.charAt(i);
//        }

        //System.out.println(Arrays.toString(ch1));

        // Printing the character array
//        for (char x : ch1) {
//            System.out.println(x);
//        }
//
//        for (char y : ch2) {
//            System.out.println(y);
//        }
        if (ad1.charAt(0)==ad2.charAt(ad2.length()-1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
