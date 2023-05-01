package variablespack;

import java.util.Scanner;

public class TekCutTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int eded = sc.nextInt();

        if(eded % 2 == 0){
            System.out.println("Cut");
        }else{
            System.out.println("tek");
        }
    }
}
