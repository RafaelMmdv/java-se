package loopspack;

public class LoopsTask1 {

    public static void main(String[] args) {

        int cem = 0;

        for(int i =0; i<5; i++){
            System.out.println("");
            for (int  j = 0; j<i; j++){

                if (cem < 15){
                    cem++;
                    System.out.print(cem);
                }
            }
        }
    }
}
