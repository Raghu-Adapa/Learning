package searching.binarysearch;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        //int[] arr = {2,5,6,0,0,1,2};
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        //int[] arr = {1};
        int index = searchInRotatedArray(arr, 1);

        System.out.println("Found at : "+ index);

    }

    private static int searchInRotatedArray(int[] nums, int target){

        int pivot = findPivotWithDuplicates(nums);

        System.out.println(pivot);

        if(pivot == -1){
            return binarySearch(nums, 0, nums.length-1, target);
        }

        if(target >= nums[0]){
            return binarySearch(nums, 0, pivot, target);
        }else {
            return binarySearch(nums, pivot+1, nums.length-1, target);
        }

    }

    private static int binarySearch(int[] nums, int start, int end, int target) {

        while (start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    private static int findPivotWithDuplicates(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            // if elements at start, mid, end are samer, just skip the duplicates

            if ((nums[start] == nums[mid]) && (nums[end] == nums[mid]))
            {
                // check whether start or end are pivit before skipping
                if(nums[start] > nums[start+1])
                    return start;
                start++;

                if(nums[end] < nums[end-1])
                        return end-1;
                end--;
            }else if(nums[start] < nums[mid]  || (nums[start] == nums[mid] && nums[mid]>nums[end])){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
