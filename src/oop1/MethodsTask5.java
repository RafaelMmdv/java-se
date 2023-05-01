package oop1;

public class MethodsTask5 {

    public static int result(int[] ededler){

    int cem = 0;

        for (int eded : ededler){
        cem += eded;
    }
        return cem;
}
    public static void main(String[] args) {


        int[] ededler = new int[10];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 58;
        ededler[5] = 82;
        ededler[6] = 71;
        ededler[7] = 17;
        ededler[8] = 33;
        ededler[9] = 77;


        System.out.println(result(ededler));

    }
}
