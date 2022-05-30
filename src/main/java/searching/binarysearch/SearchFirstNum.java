package searching.binarysearch;

public class SearchFirstNum {

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,12,15,18,22,27,35,26,58,72,89};
        int target = 7;

        int index = findFirst(arr, target);
        System.out.println(index);

    }

    private static int findFirst(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        int index = -1;
        while(start<=end){
            int mid = start + ( end - start )/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                index = mid;
                end = mid-1;
            }

        }
        return index;
    }
}
