package arrayspack;

public class ArrayTask13 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,8,9};

        int index = 3;

        for (int i = 0; i < arr.length; i++){

            if (index==arr[i]){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
