package searching.binarysearch;

import java.util.Arrays;

public class SearchRangeNum {

    public static void main(String[] args) {

        int[] nums = {};

        int[] range = searchRange(nums, 6);

        System.out.println(Arrays.toString(range));

    }

    public static int[] searchRange(int[] nums, int target) {

        int first = binarySearch(nums, target, true);
        if(first == -1)
            return new int[]{-1, -1};
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};

    }

    private static int binarySearch(int[] arr, int target, boolean isFirst){

        int start = 0;
        int end = arr.length-1;

        int found = -1;
        while (start<=end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if( target > arr[mid]){
                start = mid+1;
            }else{
                found = mid;
                if(isFirst){
                    end = end-1;
                }else{
                    start = start+1;
                }
            }

        }
        return found;
    }
}
