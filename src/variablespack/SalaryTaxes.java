package variablespack;

import java.util.Scanner;

public class SalaryTaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maasinizi daxil edin");
        double maas = sc.nextDouble();
        if(maas > 0) {
            if (maas <= 300 && maas > 0){
                double vergi = (maas * 5)/100;
                System.out.println("Vergi: " + vergi + "manat");
            } else if ( maas > 301 && maas <=500){
                double vergi = (maas * 10)/100;
                System.out.println("Vergi: " + vergi + "manat");
            } else if (maas > 501 && maas <= 700){
                double vergi = (maas * 15)/100;
                System.out.println("Vergi: " + vergi + "manat");
            } else {
                double vergi = (maas * 20)/100;
                System.out.println("Vergi: " + vergi + " manat");
            }
        } else {
            System.out.println("Maas menfi ola bilmez!");
        }
    }
}
