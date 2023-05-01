package oop1;

import java.util.Scanner;

public class MethodsTask4 {

    public static int result(int eded, int quvvet){
        int result = eded;
        for(int i = 1; i<quvvet; i++){

            eded =eded * result;

        }
        return eded;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("eded daxil edin");
        int eded = sc.nextInt();

        System.out.println("quvvet daxil edin");
        int quvvet = sc.nextInt();

        int netice = result(eded,quvvet);
        System.out.println(netice);
    }
}
