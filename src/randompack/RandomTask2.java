package randompack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sifrenin uzunlugunu teyin edin: ");
        int sifre = sc.nextInt();

        char[] str = new char[sifre];
        String nums = "123456789";
        Random rd = new Random();

        for (int i = 0; i< sifre; i++){
            str[i] = nums.charAt(rd.nextInt(str.length));
            for (int j = 0; j<sifre; j++){


            }

        }
        System.out.println(str);
    }
}
