package operatorspack;

import java.util.Scanner;

public class OperatorsCls4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = sc.nextInt();

        String c = (a>b)?"duzdur":"sehvdir";
        System.out.println(c);

    }

}
