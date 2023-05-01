package ifswitchpack;
import java.util.Scanner;

public class IfCls2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi daxil edin");
        String name = sc.next();
        String surname = "";

        if (name.equals("Rafael")){
            surname = "Mammadov";
        }else{
            surname = "not found";
        }

        System.out.println(surname);
    }
}
