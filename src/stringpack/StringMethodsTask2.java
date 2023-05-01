package stringpack;

import java.util.Scanner;

public class StringMethodsTask2 {

    public static void main(String[] args) {

        String ad = "rafael";

        char[] ch = new char[ad.length()];

        for(int i = 0; i < ad.length(); i++){
            ch[i] = ad.charAt(i);

        }

//        for ( char name : ch){
//            System.out.println(name);
//        }
        char[] chr = new char[ad.length()];

        for(int j = 0; j < ad.length(); j++){
            chr[j] = ad.charAt(j);


        }
        if(ad.indexOf("r")==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
