package randompack;

import java.util.Random;

public class RandomTask10 {
    public static void main(String[] args) {



    String [] adlar = {"Ali", "Rafael", "Ilkin"};

    Random rd = new Random();

    int index1 = 0;
    int index2 = 0;

    while (index1 == index2){
        index1 = rd.nextInt(adlar.length);
        index2 = rd.nextInt(adlar.length);

    }

    String ad1 = adlar[index1];
    String ad2 = adlar[index2];

        System.out.println(ad1 + "  " + ad2);
    }
}
