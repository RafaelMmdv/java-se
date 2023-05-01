package arrayspack;

import java.util.Scanner;

public class ArrayTask6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded sayi daxil edin: ");
        int ededler = sc.nextInt();

        int[] inserted = new int[ededler];
        int sum = 0;

//        int[] arr = {5,22,30};

        for(int i = 0; i<inserted.length; i++){
            sc = new Scanner(System.in);
            System.out.println((i + 1)+"-ci ededi daxil edin");
            int name = sc.nextInt();
            inserted[i] = name;

        }
        for(int i = 0; i<inserted.length; i++){
            sum+=inserted[i];

        }
        System.out.println(sum/inserted.length);
    }
}
