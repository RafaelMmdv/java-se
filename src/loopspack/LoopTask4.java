package loopspack;

import java.util.Scanner;

public class LoopTask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int a = sc.nextInt();

        System.out.println("Eded daxil edin");
        int b = sc.nextInt();

        int sum = 0;
        int count = 0;

        for(int i = a; i<=b; i++ ){
            if(i % 2 == 0 && i % 3 ==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("Say: " +count);
        System.out.println("Cem: " +sum);
    }
}
