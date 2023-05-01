package variablespack;

import java.util.Scanner;

public class ThreeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int eded = sc.nextInt();
        if (eded % 3 == 0 ){
            System.out.println("Eded 3-e bolunur");
        } else if (eded % 4 == 0) {
            System.out.println("Eded 4-e bolunur");
        }else {
            System.out.println("eded ne 3-e, ne de 4-e bolunur");
        }
    }
}
