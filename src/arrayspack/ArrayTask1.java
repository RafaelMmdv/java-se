package arrayspack;

public class ArrayTask1 {

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

        int tek = 0;
        int cut = 0;

        int cemsum = 0;
        int teksum = 0;

        for(int eded : ededler){
            if(eded % 2 == 0) {

                cemsum+=eded;
                cut++;

            }else {

                tek++;
                teksum+=eded;
            }


        }
        System.out.println("netice: " + cemsum);
        System.out.println("say: " + cut);

        System.out.println("netice: " + teksum);
        System.out.println("say: " + tek);
    }
}
