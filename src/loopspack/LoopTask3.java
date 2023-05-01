package loopspack;

import java.util.Scanner;

public class LoopTask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("A-ededi daxil edin");
        int a = sc.nextInt();

        System.out.println("B-ededi daxil edin");
        int b = sc.nextInt();

        int count = 0;
        int sum = 0;



        for (int i = a; i<=b; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                count++;
                sum += i;

            }
        }
        System.out.println("Say: " + count);
        System.out.println("Cem: " + sum);


    }
}
