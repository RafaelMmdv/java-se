package stringpack;

import java.util.Scanner;

public class StringMethodsTask {
    public static void main(String[] args) {
        String name  = "salam";

        char [] ch = new char[name.length()];

        for(int i = 0; i < name.length(); i++){
            ch[i] = name.charAt(i);

        }

        for (char c : ch){
            System.out.println(c);
        }
    }
}
