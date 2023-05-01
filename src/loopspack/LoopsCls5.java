package loopspack;

public class LoopsCls5 {
    public static void main(String[] args) {

        String cem = "";

        for (int i = 1; i<=10; i++){
            if(i==5){
                continue;
            }
            cem = cem + i;
        }

        System.out.println("cavabi: " +cem);
    }
}
