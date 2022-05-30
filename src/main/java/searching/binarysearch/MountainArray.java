package searching.binarysearch;

public class MountainArray {

    public static void main(String[] args) {
        int[] arr = {2,4,7,9,12,15,18,22,27,35,7,5,2,1};

        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start < end ){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                // it is in decreasing sort array
                // mid also might me the answer
                end = mid;
            }else{
                // it is in increasing sort array
                // mid is not the possible ans because mid+1 is greater than mid
                start = mid+1;
            }

        }
        return start; // return start or end as both are same at this time;


    }
}
