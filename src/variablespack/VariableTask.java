package variablespack;

import java.util.Scanner;

public class VariableTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilk ededi daxil edin");
        int a = sc.nextInt();

        System.out.println("Ikinci ededi daxil edin");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a b-den boyukdur");
        } else if (a<b) {
            System.out.println("a b-den kicikdir");
        } else {
            System.out.println("a b-ye beraberdir");
        }
    }
}
