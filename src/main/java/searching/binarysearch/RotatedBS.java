package searching.binarysearch;

public class RotatedBS {

    public static void main(String[] args) {

        //int[] arr = {90, 2,4,7,9,12,15,18,22,26,27,35,58,72,89};
        int[] arr = {2,9,2,2,2};
        int target = 2;

        int index = rotatedBinarySearch(arr, target);
        System.out.println(index);
    }

    private static int rotatedBinarySearch(int[] arr, int target) {

        int pivot = findPivot(arr);
        if(pivot == -1 ){
            return binarySearch(arr, target, 0, arr.length-1);
        }

        if(target == arr[pivot]){
            return pivot;
        }
        if(target >= arr[0]){
            // search in the first half
            return binarySearch(arr, target, 0, pivot-1);
        }

        // search in the second half
       return binarySearch(arr, target, pivot+1, arr.length-1);


    }

    private static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target, int start, int end){

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if( target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
