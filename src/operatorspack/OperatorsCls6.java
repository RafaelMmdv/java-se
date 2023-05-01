package operatorspack;

import java.util.Scanner;

public class OperatorsCls6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = sc.nextInt();
        System.out.println("ucuncu ededi daxil edin");
        int c = sc.nextInt();
        System.out.println("dorduncu ededi daxil edin");
        int d = sc.nextInt();

        boolean netice = a>b||c<=d;
        System.out.println(netice);
    }

}

