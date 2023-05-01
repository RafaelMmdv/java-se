package arrayspack;

public class ArrayCls6 {

    public static void main(String[] args) {

        String[] names = new String[6];
        names[0]="Rahman";
        names[1]="Tarlan";
        names[2]="Mahammad";
        names[3]="Najmaddin";
        names[4]="Vafa";
        names[5]="Rafael";

        int[] ages = new int[6];
        ages[0] = 20;
        ages[1] = 24;
        ages[2] = 26;
        ages[3] = 28;
        ages[4] = 25;
        ages[5] = 22;

        for(int i = 0; i<=5; i++){
            System.out.println("adi: " + names[i] + " " + "yashi: " + ages[i]);
        }

    }
}
