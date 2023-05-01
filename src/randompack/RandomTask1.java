package randompack;

import java.util.Scanner;

public class RandomTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sifrenin uzunlugunu daxil edin");
        int ulduz = sc.nextInt();
        System.out.println(ulduz);


        for (int i = 0; i < ulduz; i++){
            System.out.print("*");
        }

    }
}
