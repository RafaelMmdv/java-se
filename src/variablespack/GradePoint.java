package variablespack;

import java.util.Scanner;

public class GradePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balinizi daxil edin");
        double bal = sc.nextDouble();

        if(bal >= 51 && bal < 61){
            System.out.println("Qiymet:E");
        } else if (bal >= 61 && bal < 71) {
            System.out.println("Qiymet:D");
        } else if (bal >= 71 && bal < 81) {
            System.out.println("Qiymet:C");
        } else if (bal >= 81 && bal < 91){
            System.out.println("Qiymet:B");
        } else if (bal >= 91 && bal <= 100){
            System.out.println("Qiymet:A");
        } else {
            System.out.println("Kesr");
        }

    }
}
