package randompack;

import java.util.Random;

public class RandomTask7 {

    public static void main(String[] args) {

        String [] arr = { "Rafael", "Ali", "Musa", "Fakhri"};

        Random rd = new Random();
        String name = String.valueOf(rd.nextLong());
        System.out.println(name);

    }
}
