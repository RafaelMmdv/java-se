package arrayspack;

public class ArrayTask11 {

    public static void main(String[] args) {

        int [] arr = {14, 28, 32};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            //sum += arr[i];
            sum = arr[0] + arr[1] + arr[2];
        }
        System.out.println(sum/arr.length);
    }
}
