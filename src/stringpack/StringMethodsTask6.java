package stringpack;

public class StringMethodsTask6 {
    public static void main(String[] args) {

        String sentence = "asasasdafsdsmafsddfjsda";
        char letter = 'a';

        int count = 0;
int cem = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
                cem+=i;
            }
        }

        System.out.println(count + "cem: " + cem);

    }
}
