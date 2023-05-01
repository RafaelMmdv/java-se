package arrayspack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCls4 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 54;

        Arrays.sort(ededler);

        for(int eded : ededler){
            System.out.println(eded);
        }
    }
}
