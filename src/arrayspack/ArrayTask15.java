package arrayspack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin: ");
        int arr = sc.nextInt();
        int[] arrNum = new int[arr];

        for (int i = 0; i < arrNum.length; i++){
            System.out.println(i+1 + "-ci ededi daxil edin: ");
            arrNum[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrNum));

        int cem = 0;

        for (int j = 0; j < arrNum.length; j++){

            if (arrNum[j]%2==0){
                cem++;
            }
        }
        System.out.println(cem + " cem ededlerdir");
        System.out.println(arrNum.length - cem + " tek ededlerdir");

    }
}
