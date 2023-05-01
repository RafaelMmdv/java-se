package arrayspack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int enter = sc.nextInt();

        int[] ededler = new int[10];

        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 54;
        ededler[5] = 68;
        ededler[6] = 64;
        ededler[7] = 80;
        ededler[8] = 64;
        ededler[9] = 50;

        boolean found = false;

        for (int eded : ededler) {
            if (enter == eded) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(enter + " is found.");
        } else {
            System.out.println(enter + " is not found.");
        }

        int [] say = new int[ededler.length];

        int j = 0;

        for (int i = 0; i < ededler.length-1; i++) {
            if (ededler[i] == enter) {
                say[j] = i;
                j++;

                System.out.println("Index number is: "+i);


            }
        }
        System.out.println(Arrays.toString(say));

        int [] say1 = new int[say.length];

        int a = 0;

        for (int k = 0; k< say.length; k++){
            if(say1[k]==0){
                continue;
            }
            say1[k] = say[k];
        }
        System.out.println(Arrays.toString(say1));
    }
}
