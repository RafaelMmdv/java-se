package stringpack;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodsTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split(" ");
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
