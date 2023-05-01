package loopspack;

import java.util.Scanner;

public class LoopsCls4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        int cem = 0;

        for(int i = 1; i<=10; i++){
            cem = cem + i;
        }
        System.out.println(cem);
    }
}
