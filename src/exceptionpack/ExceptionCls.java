package exceptionpack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");

        try {
            int eded = sc.nextInt();
            System.out.println(eded);
        }catch (ArithmeticException aex) {
            System.out.println(aex);
        }catch (InputMismatchException iex){
            System.out.println(iex);
        }
        finally {
            System.out.println("Najmaddin Huseynov");
        }

        System.out.println("Fakhri Asadov");


    }
}

