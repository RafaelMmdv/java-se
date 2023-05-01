package appclass;

import java.util.Random;
import java.util.Scanner;

public class MainCls {

    public static String check () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Istifadechi adi daxil edin: ");
        String username = sc.next();
        System.out.println("Istifadechi shifresi daxil edin: ");
        int password = sc.nextInt();

        int i = 0;
        while (!username.equals("admin") && password != 12345 && i < 2) {

                i++;
                System.out.println("Entered false info. Enter Username: ");
                username = sc.next();
                System.out.println("Input password: ");
                password = sc.nextInt();

            } if (username.equals("admin") && password == 12345 && i < 2){

                return "You are Logged";
            }

        else {
            return "You have failed";

        }

    }

    public static String users (){

        String names = null;
        for (int i = 1; i < names.length(); i++){
            String[] name = new String[i];
        }
        return names;

    }

    public static String menu (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Növbəti əməliyyatı seçin:" +
                "1. Yarışmaya başla"  +
                "2. Logout" +
                "3. Exit");
        int sec = sc.nextInt();

        switch (sec){
            case 1:
                game();
                break;
            case 2:
                check();
                break;
            case 3:
                System.out.println("Proqramdan cixilir");
                break;
                default:
                    System.out.println("Bele secim yoxdur!");
        }

        return "proqram bitti";
    }

    public static String game (){
        Scanner sc = new Scanner(System.in);
        System.out.println("1-ile 5 arasinda bir eded daxil edin: ");
        int eded = sc.nextInt();

        Random rd = new Random();
        int str = rd.nextInt();

        if (eded == str){
            return "Siz qalib geldiniz";
        }
        return "Siz uduzdunuz";

    }

    public static void main(String[] args) {
        System.out.println(check());
        //System.out.println(Arrays.toString(users().toCharArray()));
        System.out.println(menu());
        Scanner sc = new Scanner(System.in);
        System.out.println("Istifadeci sayi daxil edin: ");
        int say = sc.nextInt();
        String[] names = new String[say];
        for (int i = 0; i < say; i++){
            System.out.println((i+1) + "-ci adami daxil edin");
            names[i] = sc.next();
        }

        System.out.println(game());
    }
}
