package loopspack;

import java.util.Scanner;

public class LoopTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin");

        int eded = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=eded; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
