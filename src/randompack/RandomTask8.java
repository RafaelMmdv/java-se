package randompack;

import java.util.Random;

public class RandomTask8 {

    public static void main(String[] args) {

        String[] students = {"Rafael", "Eli", "Adil"};


//        Random random = new Random();
//        int index = random.nextInt(students.length);
//        int index2 = random.nextInt(students.length);

        boolean bool = false;

        while (bool = true) {
            int index = 0;
            int index2 = 0;
//
            Random random = new Random();
            index = random.nextInt(students.length);
            index2 = random.nextInt(students.length);

            if (students[index] == students[index2]) {

                bool = false;
            } else {
                bool = true;
                System.out.println(students[index] + " " + students[index2]);
            }
        }


//        if (students[index] == students[index2]) {
//            bool = false;
//        } else {
//            bool = true;
//            System.out.println(students[index] + " " + students[index2]);
//        }
    }
}