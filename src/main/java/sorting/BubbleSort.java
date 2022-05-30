package sorting;

import java.util.Arrays;

public class BubbleSort {


    // For every outer loo iteration,
    // maximum value will will be placed at end of the array
    // we can assume that after k iterations, right K elements will be in sorted order

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,5,3,4};

        bubbleSort1(arr);

        Arrays.stream(arr).forEach(num -> System.out.println(num) );
        //System.out.println(arr.toString());
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int k=0;k<n;k++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    // optimizes by redusing some iterations but
    // still TC = O(N2)
    private static void bubbleSort1(int[] arr) {
        int n = arr.length;

        for(int k=0;k<n;k++) {
            boolean flag = true;
            for (int i = 0; i < n - k- 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                    flag = false;
                }
            }
            if(flag) break;
        }
    }
}
