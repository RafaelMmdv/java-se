package loopspack;

import java.util.Scanner;

public class LoopsCls9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();

        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        int cutcem = 0;
        int tekcem = 0;

        int teksay = 0;
        int cutsay = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                cutcem = cutcem + i;
                cutsay++;
            } else {
                tekcem = tekcem + i;
                teksay++;
            }
        }
        System.out.println(tekcem);
        System.out.println("Say: " + teksay);
        System.out.println(cutcem);
        System.out.println("Say: " + cutsay);
    }
}
