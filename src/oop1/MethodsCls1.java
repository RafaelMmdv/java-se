package oop1;

import java.util.Scanner;

public class MethodsCls1 {

    //geriye deyer qaytarandi yoxsa yox
    //hansi tip qayidacaq
    //parametrli ya bosh
    //nece dene hansi tip

    static String musMen(int eded) {
        String netice = "";

        if (eded>0){
            netice = "musbet";
        }else if(eded < 0){
            netice = "menfi";
        }else{
            netice = "sifir";
        }

        return netice;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int a = scanner.nextInt();
        String t = musMen(a);
        System.out.println(t);
    }
}
