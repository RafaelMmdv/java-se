package randompack;

import java.util.Random;

public class RandomTask6 {

    public static void main(String[] args) {

        String[] students = {"Rafael","Eli","Adil"};


        Random random = new Random();
        int index = random.nextInt(students.length);
        int index2 = random.nextInt(students.length);

        boolean bool = false;

        if (students[index] == students[index2]){
            bool = false;
        }else {
            bool = true;
            System.out.println(students[index] + " " + students[index2]);
        }


    }
}
