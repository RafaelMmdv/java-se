package oop1;

import java.util.Scanner;

public class MethodsTask1 {

    public static String a(int bal){
        if (bal > 91){
            return ("A aldiniz!");
        } else if (bal>81&&bal<91){
            return ("B aldiniz!");
        }else if (bal>71&&bal<81){
            return ("C aldiniz");
        }else if (bal>61&&bal<71){
            return ("D aldiniz");
        }else {
            return ("Kesr");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();

        String netice = a(bal);
        System.out.println(netice);
    }
}
