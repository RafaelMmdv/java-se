package variablespack;

import java.util.Scanner;

public class VariablesCls3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = sc.nextInt();

        int netice = a+b;

        System.out.println("Cavabi: " +netice);

    }
}
