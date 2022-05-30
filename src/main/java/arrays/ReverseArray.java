package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};
        reverseArray(arr);

        Arrays.stream(arr).forEach( s -> System.out.print(s+" "));
        System.out.println("");

    }

    private static void reverseArray(int[] arr) {

        int n = arr.length;

        for(int i=0;i<(n-1)/2;i++){

            int tmp = arr[n-i-1];
            arr[n-1] = arr[i];
            arr[i] = tmp;

        }
    }
}
