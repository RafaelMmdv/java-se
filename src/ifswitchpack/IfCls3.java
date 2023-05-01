package ifswitchpack;

import java.util.Scanner;

public class IfCls3 {

    public static void main(String[] args) {

        boolean status = false;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>15){
            status = true;
        }
        System.out.println(status);
    }
}
