package oop1;

import java.util.Scanner;

public class MethodsTask10 {

    public static int result (String cumle){

        int count = 0;

        for (int i = 0; i <  cumle.length();i++){

            if (cumle.charAt(i) == 'a' || cumle.charAt(i) == 'e' || cumle.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cumleni daxil edin: ");
        String cumle = sc.nextLine();

        System.out.println(result(cumle));
    }
}
