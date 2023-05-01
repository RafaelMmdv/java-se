package arrayspack;

import java.util.Scanner;

public class ArrayTask8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("eded daxil edin");
        int [][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(i + " " +  j +"-ci ededi daxil edin");
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);

            }
        }
    }
}
