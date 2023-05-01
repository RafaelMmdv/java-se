package randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sifrenin uzunlugunu daxil edin: ");
        int sifre = sc.nextInt();

        String reqem = "0123456789";
        String herf = "ABCDEFGHIJKOPQRSTUVWXYZ";
        String result = reqem + herf;

        Random rand = new Random();

        char[] password = new char[sifre];
//        char[] password1 = new char[password.length];

        for (int i = 0; i<sifre; i++){

//            if(password[i] == password1[i])

            password[i] = result.charAt(rand.nextInt(result.length()));
//            password[i] = password1[i];
        }

        System.out.println(password);
    }
}
