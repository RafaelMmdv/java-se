package stringpack;

import java.util.Scanner;

public class StringMethodsTask7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cumle daxil edin: ");
        String soz = sc.nextLine();

        int say = 0;

        for (int i = 0; i < soz.length();i++){

            if (soz.charAt(i)== 'a' || soz.charAt(i) == 'e' || soz.charAt(i) == 'i'){
                say++;
            }
        }

        System.out.println(say);
    }
}
