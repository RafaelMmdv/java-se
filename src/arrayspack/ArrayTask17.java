package arrayspack;

import java.util.Arrays;

public class ArrayTask17 {
    public static void main(String[] args) {

        int[] intgr = {1, 2, 3, 4, 5, 6 ,7 ,8, 9};
        int[] intgr1 = new int[intgr.length];
        int[] intgr2 = new int[intgr.length];

        for (int i = 0; i < intgr.length; i++){
            if (i%2==0){
                intgr1[i] = intgr[i];
            } else {
                intgr2[i] = intgr[i];
            }
        }

        System.out.println(Arrays.toString(intgr1));
        System.out.println(Arrays.toString(intgr2));

        for (int j = 0; j < intgr1.length; j++){
            if (intgr1[j] == 0){
                continue;

            }
            System.out.println(intgr1[j]);
        }

    }
}
