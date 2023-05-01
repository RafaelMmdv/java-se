package arrayspack;

import java.util.Arrays;

public class ArrayCls5 {

    public static void main(String[] args) {

        String[] names = new String[6];
        names[0]="Rahman";
        names[1]="Tarlan";
        names[2]="Mahammad";
        names[3]="Najmaddin";
        names[4]="Vafa";
        names[5]="Rafael";

        Arrays.sort(names);

        for (String a:names){  //enhancement for
            System.out.println(a);
        }
    }
}
