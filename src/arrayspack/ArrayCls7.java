package arrayspack;

import java.util.Arrays;

public class ArrayCls7 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 54;

        Arrays.sort(ededler);

        int min = ededler[0];
        int max = ededler[ededler.length-1];

        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
    }
}
