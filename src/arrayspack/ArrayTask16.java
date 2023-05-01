package arrayspack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask16 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String[] groupC = {"Argentina", "Poland", "Mexico", "UAE"};

        String[] pleyOff = new String[2];
        int g = 0;

        System.out.println("Argentinanin neticesi: ");
        int arg = sc.nextInt();

        System.out.println("Polsanin neticesi: ");
        int pld = sc.nextInt();

        System.out.println("Meksikanin neticesi: ");
        int mxc = sc.nextInt();

        System.out.println("UAE-nin neticesi: ");
        int uae = sc.nextInt();

        for (int i = 0; i < groupC.length; i++){
            System.out.println(groupC[i]);
        }

        String[] name = {"arg", "pld", "mxc", "uae"};
            int k = 0;
            boolean bool = false;
        for (int j = 0; j < pleyOff.length; j++) {
            if (arg > pld && mxc > uae) {
                System.out.println(groupC[0] + " ve " + groupC[2] + " " + "Qelebe qazandi");
                pleyOff[j] = name[j];
            } else if (arg < pld && mxc < uae) {
                System.out.println(groupC[2] + " ve "+ groupC[3] + " " + "Qelebe qazandi");
                pleyOff[j] = name[j];
            } else if (arg > pld && mxc < uae){
                System.out.println(groupC[0] + " ve "+ groupC[3] + " " + "Qelebe qazandi");
                pleyOff[j] = name[j];
            }else if(arg < pld && mxc > uae){
                System.out.println(groupC[1] + " ve "+ groupC[2] + " " + "Qelebe qazandi");
                pleyOff[j] = name[j];
            }else {
                System.out.println("Game Over");
            }
        }


//        for (int d = 0; d<pleyOff.length; d++){
//            System.out.println(pleyOff[d]);
//        }

        System.out.println(Arrays.toString(pleyOff));
    }

}

