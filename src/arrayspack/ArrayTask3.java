package arrayspack;

import java.util.Scanner;

public class ArrayTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nece telebe daxil edeceksiniz");

        int countStudent = sc.nextInt();
        String[] students = new String[countStudent];

        for (int i = 0; i < students.length; i++){
            sc = new Scanner(System.in);
            System.out.println((i + 1)+"-ci telebeni daxil edin");
            String name = sc.nextLine();
            students[i] = name;
        }

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i]);
        }
    }
}
