package searching.binarysearch;

public class FloarOfNumber {

    public static void main(String[] args) {

        int[] arr = {2,4,7,9,12,15,18,22,27,35,26,58,72,89};

        int index = floar(arr, 14);
        System.out.println(arr[index]);

        int index1 = floar(arr, 26);
        System.out.println(arr[index1]);

        int index2 = floar(arr, 90);
        System.out.println("Floar of 90 is  "+arr[index2]);

        int index3 = floar(arr, 1);
        System.out.println("Floar of 1 is  "+ index3);

    }

    private static int floar(int[] arr, int target){

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
        return end;
    }
}
