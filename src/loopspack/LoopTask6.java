package loopspack;

import java.util.Scanner;

public class LoopTask6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("eded daxil edin");
        int eded = sc.nextInt();

        System.out.println("quvvet daxil edin");
        int quvvet = sc.nextInt();

        int result = eded;
        for(int i = 1; i<quvvet; i++){

            eded =eded * result;

        }
        System.out.println(eded);

    }
}
