package arrayspack;

import java.util.Scanner;

public class ArrayTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nece eded daxil edeceksiniz");

        int [][] array = new int [2][3];

        for (int setir = 0; setir < array.length; setir++ ){
            for (int sutun = 0; sutun<array[setir].length; sutun++){
                System.out.println(setir + " " + sutun + "daxil edin");
                array[setir][sutun] = sc.nextInt();
            }
        }

        for (int setir = 0; setir < array.length; setir++ ){
            for (int sutun = 0; sutun<array[setir].length; sutun++){
                System.out.println(array[setir] [sutun]);
            }
        }
    }
}

