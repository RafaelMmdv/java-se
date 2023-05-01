package ifswitchpack;

import java.util.Scanner;

public class SwitchCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("gunu daxil edin");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("bazar ertesi");
                break;

            case 2:
                System.out.println("cershenbe axshami");
                break;
            case 3:
                System.out.println("cershenbe ");
                break;
            case 4:
                System.out.println("cume axshami");
                break;
            case 5:
                System.out.println("cume");
                break;
            case 6:
                System.out.println("shenbe");
                break;
            case 7:
                System.out.println("bazar");
                break;
            default:
                System.out.println("bele gun yoxdur");
        }
    }
}
