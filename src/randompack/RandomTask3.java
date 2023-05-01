package randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sifrenin uzunlugunu daxil edin: ");
        int sifre = sc.nextInt();

        String herf = "ABCDEFGHIJKOPQRSTUVWXYZ";

        Random rand = new Random();
        char[] password = new char[sifre];

        for (int i = 0; i < sifre; i++){

            password[i] = herf.charAt(rand.nextInt(password.length));

        }
        System.out.println(password);

    }
}
