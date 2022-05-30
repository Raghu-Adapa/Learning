package searching.binarysearch;

public class CeilingOfNum {

    public static void main(String[] args) {

        int[] arr = {};
        System.out.println("Length of an Array = "+ arr.length);

        int index = floar(arr, 14);
        System.out.println(index);

        int index1 = floar(arr, 26);
        System.out.println(index1);

        int index2 = floar(arr, 90);
        System.out.println("Floar of 90 is  "+index2);

        int index3 = floar(arr, 1);
        System.out.println("Floar of 1 is  "+ index3);
    }

    private static int floar(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        if(arr.length == 0){
            return -1;
        }

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
        return start;
    }
}
