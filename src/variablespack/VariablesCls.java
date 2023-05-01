package variablespack;

import java.util.Scanner;

public class VariablesCls {
    public static void main(String[] args) {
        /* int a = 45;
           double d = 85.5;
           char c = 'o';
           String b = "sgfdfhgjhgyffgvh<.";
           boolean s = true;
           float t = 56.7F;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("adinizi daxil edin");
        String name = sc.next();
        System.out.println("Yashinizi daxil edin");
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}

