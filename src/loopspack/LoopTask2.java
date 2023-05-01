package loopspack;

public class LoopTask2 {

    public static void main(String[] args) {

        int tek = 0;
        int cut =0;

        for(int i = 0; i<20; i++){
            if(i % 2 == 0 && i!=0){

                cut++;
            }else{

                tek++;
            }

        }
        System.out.println("cut " +cut);
        System.out.println("tek " +tek);
    }
}
