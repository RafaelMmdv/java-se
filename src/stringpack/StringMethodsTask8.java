package stringpack;

import java.util.Scanner;

public class StringMethodsTask8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String S1 = S.substring(start,end);
        System.out.println(S1);
    }
}
