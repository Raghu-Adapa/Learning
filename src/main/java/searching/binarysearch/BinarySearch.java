package searching.binarysearch;

public class BinarySearch {

    // orger Agnostic means - it is in order but don't know whether it is asc or desc

    public static void main(String[] args) {

        int[] arr = {2,4,7,9,12,15,18,22,27,35,26,58,72,89};
        int target = 18;

        int index = binarySearch(arr, target);
        System.out.println(index);

        int index1 = binarySearchAgnostic(arr, target);
        System.out.println(index);

        int[] arr2 = {92,84,47,39,32,25,18,17,15,12,11,8,0,-5,-25};
        int target2 = 47;

        int index2 = binarySearchAgnostic(arr2, target2);
        System.out.println(target2 + "found at "+index2);

    }

    private static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

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

    private static int binarySearchAgnostic(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
