package arrayspack;

import java.util.Arrays;

public class ArrayTask2 {

    public static void main(String[] args) {

        int[] ededler = new int[10];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 58;
        ededler[5] = 82;
        ededler[6] = 71;
        ededler[7] = 17;
        ededler[8] = 33;
        ededler[9] = 77;

        Arrays.sort(ededler);

        for(int eded : ededler){
            System.out.println(eded);

        }
    }
}
